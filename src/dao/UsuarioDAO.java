/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.cj.protocol.Resultset;
import factory.ConnectionFactory;
import gui.LoginGUI;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private Connection connection;
  //  Long id;
   // String nome;
  //  String cpf;
  //  String email;
   // String telefone;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void salvar(Usuario objUsuario) {
        try {
            String sql;
            if (String.valueOf(objUsuario.getId()).isEmpty()) {
                sql = "INSERT INTO usuario(nome,senha,email,telefone,passatempos,biografia,nomeUsuario,habilidades) VALUES(?,?,?,?,?,?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objUsuario.getNome());
                stmt.setString(2, objUsuario.getSenha());
                stmt.setString(3, objUsuario.getEmail());
                stmt.setString(4, objUsuario.getTelefone());
                stmt.setString(5, objUsuario.getPassatempos());
                 stmt.setString(6, objUsuario.getBiografia());
                 stmt.setString(7, objUsuario.getNomeUsuario());
                 stmt.setString(8, objUsuario.getHabilidades());
                stmt.execute();
                stmt.close();

            } else {
                sql = "UPDATE usuario SET nome = ?, senha = ?, email = ?, telefone = ?, passatempos = ?,biografia = ?,nomeUsuario = ?, habilidades = ?, WHERE usuario.id = ?";

                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(9, objUsuario.getId());
                stmt.setString(1, objUsuario.getNome());
                stmt.setString(2, objUsuario.getSenha());
                stmt.setString(3, objUsuario.getEmail());
                stmt.setString(4, objUsuario.getTelefone());
                stmt.setString(5, objUsuario.getPassatempos());
                 stmt.setString(6, objUsuario.getBiografia());
                 stmt.setString(7, objUsuario.getNomeUsuario());
                 stmt.setString(8, objUsuario.getHabilidades());
                stmt.execute();
                stmt.close();

            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList buscar(Usuario objUsuario) {
        try {
            String sql = "";
            if (!objUsuario.getNome().isEmpty()) {
                sql = "SELECT * FROM usuario WHERE nome LIKE '%" + objUsuario.getNome() + "%' ";

            } else if (!objUsuario.getSenha().isEmpty()) {
                sql = "SELECT * FROM usuario WHERE senha LIKE '%" + objUsuario.getSenha() + "%' ";
            }
            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                dado.add(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("Senha"),
                    rs.getString("email"),
                    rs.getString("telefone"),
                    rs.getString("passatempos"),
                    rs.getString("Biografia"),
                    rs.getString("nomeUsuario"),
                    rs.getString("Habilidades")
                });

            }
            ps.close();
            rs.close();
            connection.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }

    }

    public void deletar(Usuario objUsuario) {
        try {
            String sql;
            if (!String.valueOf(objUsuario.getId()).isEmpty()) {
                sql = "DELETE FROM usuario WHERE usuario.id = ?";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objUsuario.getId());
                stmt.execute();
                stmt.close();
                System.out.println("");
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList listarTodos() {
        try {

            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM usuario");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                dado.add(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("Senha"),
                    rs.getString("email"),
                    rs.getString("telefone"),
                     rs.getString("passatempos"),
                    rs.getString("Biografia"),
                    rs.getString("nomeUsuario"),
                    rs.getString("Habilidades")
                });

            }
            ps.close();
            rs.close();
            connection.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }
    }
    
    public ArrayList listarUsuario(Usuario objUsuario) {
        System.out.println("ID dele"+objUsuario.getSenha());
        LoginGUI login = new LoginGUI ();
              login.pegaRetornoL();
              System.out.println("Retorno---"+ login.pegaRetornoL());
        try {

            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM usuario WHERE usuario.nomeUsuario = ?");
       
            System.out.println("ID USER mss"+ login.pegaRetornoL());
                ps.setString(1, login.pegaRetornoL());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                dado.add(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("Senha"),
                    rs.getString("email"),
                    rs.getString("telefone"),
                     rs.getString("passatempos"),
                    rs.getString("Biografia"),
                    rs.getString("nomeUsuario"),
                    rs.getString("Habilidades")
                });

            }
            ps.close();
            rs.close();
            connection.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }
    }
    //login
    public ResultSet autenticacaoUsuario(Usuario objUsuario ){
       try{
           String sql = "Select * from usuario where nomeUsuario = ? and senha = ?";
           PreparedStatement pstm = connection.prepareStatement(sql);
           pstm.setString(1, objUsuario.getNomeUsuario());
           pstm.setString(2, objUsuario.getSenha());
           ResultSet rs = pstm.executeQuery();
           return rs;
       }catch(SQLException erro){
         JOptionPane.showMessageDialog(null, "UsuarioDAo"+erro);
             return null;
       }
       
    
    }

    public static void testarConexao() throws SQLException {
        try (Connection objConnection = new ConnectionFactory().getConnection()) {
            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso! ");
        }
    }

}

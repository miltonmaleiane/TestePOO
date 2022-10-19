package modelo;

public class Usuario {

    private String id;
    private String nome;
    private String senha;
    private String email;
    private String telefone;
    private String habilidades;
    private String biografia;
    private String nomeUsuario;
    private String passatempos;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getPassatempos() {
        return passatempos;
    }

    public void setPassatempos(String passatempos) {
        this.passatempos = passatempos;
    }
  
    
    private String[] colunas = new String[]{"ID", "NOME", "SENHA", "EMAIL", "TELEFONE","PASSATEMPOS","BIOGRAFIA","USERNAME","HABILIDADES"};

    public Usuario() {
    }

    public Usuario(String id) {
        this.id = id;
    }

 
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] Colunas) {
        this.colunas = Colunas;
    }

}

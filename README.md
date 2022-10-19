# CRUD Java SE com MySQL
## CRUD em Java SE com MySQL, cadastro de usuário, usando JTable

Um aplicação básica usando o banco de dados MySQL, nela contém um CRUD usando JTables e outros componentes graficos do Swing toolkit em Java. No qual e feito pesquisa, inserção, atualização ao clicar em algum item da linha do JTable, e remover item e Login por meio do nome do usuario e password.


```sql
CREATE TABLE `usuario` (
  `id` bigint(10) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `passatempos` text NOT NULL,
  `biografia` text NOT NULL,
  `nomeUsuario` varchar(255) NOT NULL,
  `habilidades` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
```

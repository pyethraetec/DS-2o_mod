/*
	1) Crie um banco de dados chamado bobs e as tabelas para as estruturas abaixo.
  Tabelas:
	Produto (produtoid, nome, descricao, valor, qtde, marca);
	Funcionario (funcionarioid, nome, sobrenome, matricula, idade, cpf, salario, cargo);
	Cliente (clienteid, nome, cpf, endereco, cep, cidade, estado, telefone, email,
 funcionarioid);
*/

/*Criando Banco/Schema*/


/*Criando tabelas e atributos*/
CREATE TABLE produto {
	produtoid varchar auto_increment,
    nome varchar,
    descricao varchar,
    valor double,
    qtde double,
    marca varchar
}

/*Funcionario (funcionarioid, nome, sobrenome, matricula, idade, cpf, salario, cargo);*/

CREATE TABLE funcionario {
	funcionarioid varchar auto_increment,
    nome varchar,
    sobrenome varchar,
    matricula varchar,
    idade double,
    cpf varchar,
    salario float,
    cargo varchar
}

/*Cliente (clienteid, nome, cpf, endereco, cep, cidade, estado, telefone, email, funcionarioid);*/
CREATE TABLE cliente {
	clienteid varchar auto_increment,
    nome varchar,
    cpf varchar,
    endereco varchar,
    cep varchar,
    cidade varchar,
    estado string,
    telefone varchar,
    email varchar
}
# Aula 1

-- criando banco de dados
show databases;
create database java_web_rd;
use java_web_rd;
show tables;

-- criando tabelas
create table alunos( id BIGINT NOT NULL AUTO_INCREMENT, nome VARCHAR(255), email VARCHAR(255), ira DOUBLE, primary key(id)  );

-- detalhes da tabela alunos
describe alunos

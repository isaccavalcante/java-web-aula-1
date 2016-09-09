# Aula 1

Introdução

-- criando banco de dados

show databases;

create database web_rc;

use web_rc;

show tables;

-- criando tabelas

CREATE TABLE alunos( id BIGINT NOT NULL AUTO_INCREMENT, nome VARCHAR(255), email VARCHAR(255), ira DOUBLE, PRIMARY KEY(id)  );

-- detalhes da tabela alunos

describe alunos;

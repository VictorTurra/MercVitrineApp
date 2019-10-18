CREATE DATABASE MercVitrineApp;
USE MercVitrineApp;

CREATE TABLE IF NOT EXISTS Produto (
  idProduto INT NOT NULL AUTO_INCREMENT,
  Descricao VARCHAR(45) NOT NULL,
  PrecoUN DECIMAL(6,2) NOT NULL,
  QtdEstoque INT NOT NULL,
  PRIMARY KEY (idProduto));

CREATE TABLE IF NOT EXISTS Login (
  idLogin INT NOT NULL AUTO_INCREMENT,
  Email VARCHAR(45) NOT NULL,
  Username VARCHAR(45) NOT NULL,
  Senha CHAR(60) NOT NULL,
  PRIMARY KEY (idLogin));

CREATE TABLE IF NOT EXISTS Cliente (
  idCliente INT NOT NULL AUTO_INCREMENT,
  Nome VARCHAR(45) NOT NULL,
  Sobrenome VARCHAR(45) NOT NULL,
  CPF VARCHAR(45) NOT NULL,
  Telefone VARCHAR(45) NULL,
  idLogin INT NOT NULL,
  PRIMARY KEY (idCliente),
  CONSTRAINT fk_login
    FOREIGN KEY (idLogin)
    REFERENCES Login (idLogin));

CREATE TABLE IF NOT EXISTS Feedback (
  idCliente INT NOT NULL,
  idFeedback INT NOT NULL,
  Descricao VARCHAR(100) NOT NULL,
  Avaliacao TINYINT NOT NULL,
  Likes INT NULL DEFAULT 0,
  PRIMARY KEY (idFeedback, idCliente),
  CONSTRAINT fk_cliente
    FOREIGN KEY (idCliente)
    REFERENCES Cliente (idCliente));


CREATE TABLE IF NOT EXISTS Carrinho (
  idCliente INT NOT NULL,
  idItem INT NOT NULL,
  QtdItem INT NOT NULL DEFAULT 1,
  PRIMARY KEY (idCliente, idItem),
  CONSTRAINT fk_cliente
    FOREIGN KEY (idCliente)
    REFERENCES Cliente (idCliente),
  CONSTRAINT fk_produto
    FOREIGN KEY (idItem)
    REFERENCES Produto (idProduto));

CREATE TABLE IF NOT EXISTS Endereco (
  IdCliente INT NOT NULL,
  idEndereco INT NOT NULL,
  Tipo VARCHAR(10) NOT NULL,
  Logradouro VARCHAR(45) NOT NULL,
  Numero INT NOT NULL,
  Complemento VARCHAR(45) NULL,
  Bairro VARCHAR(45) NOT NULL,
  PRIMARY KEY (IdCliente, idEndereco),
  CONSTRAINT fk_cliente
    FOREIGN KEY (IdCliente)
    REFERENCES Cliente (idCliente));

CREATE TABLE IF NOT EXISTS Cartao (
  IdCliente INT NOT NULL,
  idCartao INT NOT NULL,
  Numero VARCHAR(45) NOT NULL,
  Validade VARCHAR(45) NOT NULL,
  Titular VARCHAR(60) NOT NULL,
  CodVerificador CHAR(3) NOT NULL,
  Tipo VARCHAR(45) NOT NULL,
  PRIMARY KEY (IdCliente, idCartao),
  CONSTRAINT fk_cartao_cliente
    FOREIGN KEY (IdCliente)
    REFERENCES Cliente (idCliente));

CREATE TABLE IF NOT EXISTS Pagamento (
  idPagamento INT NOT NULL AUTO_INCREMENT,
  Forma VARCHAR(45) NOT NULL,
  idCliente INT NOT NULL,
  idCartao INT NULL,
  Subtotal DECIMAL(6,2) NOT NULL,
  Status INT NOT NULL DEFAULT 0,
  PRIMARY KEY (idPagamento),
  CONSTRAINT fk_cartao
    FOREIGN KEY (idCliente , idCartao)
    REFERENCES Cartao (IdCliente , idCartao),
  CONSTRAINT fk_cliente
    FOREIGN KEY (idCliente)
    REFERENCES Cliente (idCliente));

CREATE TABLE IF NOT EXISTS Entrega (
  idEntrega INT NOT NULL AUTO_INCREMENT,
  idCliente INT NOT NULL,
  idEndereco INT NOT NULL,
  idPagamento INT NOT NULL,
  Status INT NOT NULL,
  PRIMARY KEY (idEntrega, idCliente, idEndereco, idPagamento),
  CONSTRAINT fk_endereco
    FOREIGN KEY (idEndereco , idCliente)
    REFERENCES Endereco (idEndereco , IdCliente),
  CONSTRAINT fk_pagamento
    FOREIGN KEY (idPagamento)
    REFERENCES Pagamento (idPagamento));

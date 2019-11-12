DROP DATABASE MercVitrineApp;
CREATE DATABASE MercVitrineApp;
USE MercVitrineApp;

CREATE TABLE IF NOT EXISTS Produto (
  idProduto INT NOT NULL AUTO_INCREMENT,
  Descricao VARCHAR(45) NOT NULL,
  PrecoUN DECIMAL(6,2) NOT NULL,
  QtdEstoque INT NOT NULL,
  PRIMARY KEY (idProduto),
  CONSTRAINT check_produto CHECK ( QtdEstoque >= 0 AND PrecoUN > 0 )
);

CREATE TABLE IF NOT EXISTS Item (
  idItem INT(11) NOT NULL AUTO_INCREMENT,
  QtdItem INT(11) NOT NULL DEFAULT '1',
  idProduto INT(11) NOT NULL,
  PRIMARY KEY ( idItem, idProduto ),
  CONSTRAINT fk_produto FOREIGN KEY ( idProduto )
    REFERENCES Produto (idProduto),
  CONSTRAINT check_item CHECK ( QtdItem > 0 )
);

CREATE TABLE IF NOT EXISTS Nivel (
  idNivel INT(11) NOT NULL AUTO_INCREMENT,
  Descricao VARCHAR(45) NOT NULL,
  PRIMARY KEY (idNivel)
);

CREATE TABLE IF NOT EXISTS Login (
  idLogin INT NOT NULL AUTO_INCREMENT,
  Email VARCHAR(45) NOT NULL,
  Username VARCHAR(45) NOT NULL,
  Senha CHAR(60) NOT NULL,
  idPessoa INT NOT NULL,
  idNivel INT NOT NULL,
  PRIMARY KEY (idLogin),
  CONSTRAINT fkLoginPessoa FOREIGN KEY ( idPessoa ) references Pessoa( idPessoa ),
  CONSTRAINT fkLoginNivel FOREIGN KEY ( idNivel ) references Nivel( idNivel )
);

CREATE TABLE IF NOT EXISTS Pessoa (
  idPessoa INT NOT NULL AUTO_INCREMENT,
  Nome VARCHAR(45) NOT NULL,
  Sobrenome VARCHAR(45) NOT NULL,
  CPF VARCHAR(45) NOT NULL,
  Telefone VARCHAR(45) NULL,
  idLogin INT NOT NULL,
  PRIMARY KEY (idPessoa)
);


CREATE TABLE IF NOT EXISTS Feedback (
  idPessoa INT NOT NULL,
  idFeedback INT NOT NULL,
  Descricao VARCHAR(100) NOT NULL,
  Avaliacao TINYINT NOT NULL,
  Likes INT NULL DEFAULT 0,
  PRIMARY KEY (idFeedback, idPessoa),
  CONSTRAINT fk_feedback_pessoa
    FOREIGN KEY (idPessoa)
    REFERENCES Pessoa (idPessoa),
  CONSTRAINT check_feedback CHECK ( Likes > 0 AND Avaliacao BETWEEN 0 AND 5 )
);


CREATE TABLE IF NOT EXISTS Carrinho (
  idPessoa INT NOT NULL,
  idItem INT NOT NULL,
  QtdItem INT NOT NULL DEFAULT 1,
  PRIMARY KEY (idPessoa, idItem),
  CONSTRAINT fk_idPessoa
    FOREIGN KEY (idPessoa)
    REFERENCES Pessoa(idPessoa),
  CONSTRAINT fk_produto
    FOREIGN KEY (idItem)
    REFERENCES Item(idItem),
  CONSTRAINT check_carrinho CHECK ( QtdItem > 0 )
);

CREATE TABLE IF NOT EXISTS Endereco (
  idPessoa INT NOT NULL,
  idEndereco INT NOT NULL,
  Tipo VARCHAR(10) NOT NULL,
  Logradouro VARCHAR(45) NOT NULL,
  Numero INT NOT NULL,
  Complemento VARCHAR(45) NULL,
  Bairro VARCHAR(45) NOT NULL,
  PRIMARY KEY (idPessoa, idEndereco),
  CONSTRAINT fk_pessoa
    FOREIGN KEY (idPessoa)
    REFERENCES Pessoa(idPessoa)
);

CREATE TABLE IF NOT EXISTS TipoCartao (
  idtipo_cartao INT NOT NULL auto_increment,
  descricao VARCHAR(45) NOT NULL,
  PRIMARY KEY (idtipo_cartao)
);


CREATE TABLE IF NOT EXISTS Cartao (
  idPessoa INT NOT NULL,
  idCartao INT NOT NULL,
  Numero VARCHAR(45) NOT NULL,
  validade_mes INT NOT NULL,
  validade_ano INT NOT NULL,
  Titular VARCHAR(60) NOT NULL,
  CodVerificador CHAR(3) NOT NULL,
  idTipoCartao VARCHAR(45) NOT NULL,
  PRIMARY KEY (idPessoa, idCartao),
  CONSTRAINT fk_CartaoPessoa
    FOREIGN KEY (idPessoa)
    REFERENCES Pessoa (idPessoa),
  CONSTRAINT fk_CartaoPessoa
    FOREIGN KEY (idTipoCartao)
    REFERENCES TipoCartao (idtipo_cartao));

CREATE TABLE IF NOT EXISTS Pagamento (
  idPagamento INT NOT NULL AUTO_INCREMENT,
  Forma VARCHAR(45) NOT NULL,
  idPessoa INT NOT NULL,
  idCartao INT NULL,
  Subtotal DECIMAL(6,2) NOT NULL,
  Status INT NOT NULL DEFAULT 0,
  PRIMARY KEY (idPagamento),
  CONSTRAINT fk_cartao
    FOREIGN KEY (idPessoa , idCartao)
    REFERENCES Cartao( idPessoa , idCartao )
);


CREATE TABLE IF NOT EXISTS Entrega (
  idEntrega INT NOT NULL AUTO_INCREMENT,
  idPessoa INT NOT NULL,
  idEndereco INT NOT NULL,
  idPagamento INT NOT NULL,
  Status INT NOT NULL,
  PRIMARY KEY (idEntrega),
  CONSTRAINT fk_endereco
    FOREIGN KEY (idEndereco , idPessoa)
    REFERENCES Endereco (idEndereco , idPessoa),
  CONSTRAINT fk_pagamento
    FOREIGN KEY (idPagamento)
    REFERENCES Pagamento (idPagamento));

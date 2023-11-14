CREATE DATABASE libreria;

USE libreria;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT,
    usuario VARCHAR(255),
    pwd VARCHAR(255),
    nombre VARCHAR(255),
    especialidad VARCHAR(255),
    grado INT,
    grupo VARCHAR(2),
    
    PRIMARY KEY(id)
);

CREATE TABLE prestamos (
    id INT AUTO_INCREMENT,
    autor VARCHAR(255),
    titulo VARCHAR(255),
    ISBN VARCHAR(255),
    creador VARCHAR(255),
    activo INT,
    fecha VARCHAR(255),
    
    PRIMARY KEY(id)
);

CREATE TABLE libros (
    id INT AUTO_INCREMENT,
    autor VARCHAR(255),
    titulo VARCHAR(255),
    ISBN varchar(255),
    prestado INT,
    
    PRIMARY KEY(id)
);
CREATE DATABASE boarddb;

USE boarddb;
DESC board;

CREATE TABLE board (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       writer VARCHAR(100) NOT NULL,
                       title VARCHAR(200) NOT NULL,
                       content TEXT,
                       createAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
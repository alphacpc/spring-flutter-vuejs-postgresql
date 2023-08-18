CREATE DATABASE IF NOT EXISTS discovery;

CREATE TABLE IF NOT EXISTS  users (
    user_id INT PRIMARY KEY,
    user_fname VARCHAR(100),
    user_lname VARCHAR(100),
    user_role VARCHAR(10) CHECK (user_role IN ('admin', 'visiteur')) DEFAULT 'visiteur',
	user_actif BOOLEAN,
    user_password VARCHAR(100) NOT NULL,
    user_email VARCHAR(100) NOT NULL,
	date_create TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    date_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS  lieux (
    lieu_id INT PRIMARY KEY,
    lieu_name VARCHAR(100),
    lieu_short_desc VARCHAR(255),
    lieu_desc TEXT,
    lieu_start INT,
    lieu_city VARCHAR(100),
    lieu_lat FLOAT,
	lieu_long FLOAT,
	lieu_image VARCHAR(100),
    lieu_category FOREIGN KEY(category_id) REFERENCES category(category_id),
    lieu_album FOREIGN KEY(album_id) REFERENCES album(album_id)
);

CREATE TABLE IF NOT EXITS category(
    category_id INT PRIMARY KEY,
    category_name VARCHAR(100)
);


CREATE TABLE IF NOT EXITS album(
    album_id INT PRIMARY KEY,
    album_name VARCHAR(100)
);

CREATE TABLE IF NOT EXITS photo(
    photo_id INT PRIMARY KEY,
    photo_name VARCHAR(100),
    photo_url VARCHAR(100),
    photo_album_id INT FOREIGN KEY(album_id)
    photo_album_id FOREIGN KEY(album_id) REFERENCES album(album_id)

);
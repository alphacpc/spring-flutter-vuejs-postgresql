CREATE DATABASE IF NOT EXISTS discovery;

CREATE TABLE IF NOT EXISTS  users (
    user_id INT PRIMARY KEY,
    user_fname VARCHAR(100),
    user_lname VARCHAR(100),
    user_role VARCHAR(10) CHECK (user_role IN ('admin', 'visiteur')) DEFAULT 'visiteur',
	user_actif BOOLEAN DEFAULT false,
    user_password VARCHAR(100) NOT NULL,
    user_email VARCHAR(100) NOT NULL,
	date_create TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    date_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS category(
    category_id INT PRIMARY KEY,
    category_name VARCHAR(100)
);


CREATE TABLE IF NOT EXISTS album(
    album_id INT PRIMARY KEY,
    album_name VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS photo(
    photo_id INT PRIMARY KEY,
    photo_name VARCHAR(100),
    photo_url VARCHAR(100),
	photo_album_id int NOT NULL REFERENCES album(album_id)
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
    lieu_category int NOT NULL  REFERENCES category(category_id),
    lieu_album int NOT NULL  REFERENCES album(album_id)
);


INSERT INTO public.users(
	user_id, user_fname, user_lname, user_role, user_actif, user_password, user_email)
	VALUES (1, 'mariama', 'diallo', 'visiteur', false, 'passer123', 'mariama@discover.sn');

INSERT INTO public.users(
	user_id, user_fname, user_lname, user_role, user_actif, user_password, user_email)
	VALUES (1, 'alpha', 'diallo', 'admin', false, 'passer123', 'alpha@admin.sn');

INSERT INTO public.category(
	category_id, category_name)
	VALUES (1, 'lac');

INSERT INTO public.album(
	album_id, album_name)
	VALUES (1, 'lac');

INSERT INTO public.lieux(
	lieu_id, lieu_name, lieu_short_desc, lieu_desc, lieu_start, lieu_city, lieu_lat, lieu_long, lieu_image, lieu_category, lieu_album)
	VALUES (1, 'lac rose', 'Lac historique du sénégal', 'Depuis des milliers d années ce lac a été recensé à la région de dakar', 3, 'Dakar', 14.842075, 17.226119, 'lac_rose.png', 1, 1);
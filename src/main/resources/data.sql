DROP TABLE IF EXISTS game;

CREATE TABLE game
(
    id int AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(250) NOT NULL,
    name VARCHAR(250) NOT NULL,
    console VARCHAR(250) NOT NULL,
    is_complete VARCHAR(250) NOT NULL

);


INSERT INTO game (username,name,console,is_complete)VALUES
('Buzzywuzzy87','Little Samson','NES','Yes'),
('Buzzywuzzy87','Super Castlevania IV','SNES','Yes'),
('Buzzywuzzy87','Super Metroid','SNES','Yes'),
('Buzzywuzzy87','Mega Man','NES','Yes'),
('Buzzywuzzy87','Sonic the Hedgehog','Genesis','Yes'),
('Buzzywuzzy87','Crusader of Centy','Genesis','No'),
('Buzzywuzzy87','Castlevania: Symphony of the Night','PS1','No');
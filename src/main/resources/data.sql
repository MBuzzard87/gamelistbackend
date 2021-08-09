DROP TABLE IF EXISTS game;

CREATE TABLE game
(
    id int AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(250) NOT NULL,
    name VARCHAR(250) NOT NULL,
    console VARCHAR(250) NOT NULL,
    status VARCHAR(250) NOT NULL

);


INSERT INTO game (username,name,console,status)VALUES
('Buzzywuzzy87','Little Samson','NES','Complete'),
('Buzzywuzzy87','Super Castlevania IV','SNES','Complete'),
('Buzzywuzzy87','Super Metroid','SNES','Complete'),
('Buzzywuzzy87','Mega Man','NES','Complete'),
('Buzzywuzzy87','Sonic the Hedgehog','Genesis','Complete'),
('Buzzywuzzy87','Crusader of Centy','Genesis','Not Complete'),
('Buzzywuzzy87','Castlevania: Symphony of the Night','PS1','Not Complete');
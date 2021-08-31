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
('Buzzywuzzy87','Pocky and Rocky','SNES','Not Complete'),
('Buzzywuzzy87','Contra','NES','Complete'),
('Buzzywuzzy87','Contra: Hard Corps','Genesis','Not Complete'),
('Buzzywuzzy87','Tomba','PS1','Complete'),
('Buzzywuzzy87','Super Ghouls n'' Ghosts','SNES','Not Complete'),
('Buzzywuzzy87','Super Castlevania IV','SNES','Complete'),
('Buzzywuzzy87','Super Metroid','SNES','Complete'),
('Buzzywuzzy87','Mega Man','NES','Complete'),
('Buzzywuzzy87','Mega Man II','NES','Complete'),
('Buzzywuzzy87','Mega Man III','NES','Complete'),
('Buzzywuzzy87','Mega Man IV','NES','Complete'),
('Buzzywuzzy87','Mega Man V','NES','Complete'),
('Buzzywuzzy87','Mega Man X','SNES','Complete'),
('Buzzywuzzy87','Mega Man X2','SNES','Complete'),
('Buzzywuzzy87','Mario 64','N64','Complete'),
('Buzzywuzzy87','Crusader of Centy','Genesis','Not Complete'),
('Buzzywuzzy87','Castlevania: Symphony of the Night','PS1','Not Complete'),
('Buzzywuzzy87','Donkey Kong Country','SNES','Complete'),
('Buzzywuzzy87','Donkey Kong Country 2','SNES','Complete'),
('Buzzywuzzy87','Donkey Kong Country 3','SNES','Complete'),
('Buzzywuzzy87','Mario Odyssey','Switch','Complete'),
('Buzzywuzzy87','Sonic Adventure','Dreamcast','Complete'),
('Buzzywuzzy87','Sonic Adventure 2','Dreamcast','Complete'),
('Buzzywuzzy87','Star Fox 64','N64','Complete'),
('Buzzywuzzy87','Zelda: Ocarina of Time','N64','Complete'),
('Buzzywuzzy87','Zelda: Majora''s Mask','N64','Complete'),
('Buzzywuzzy87','Sonic','Genesis','Complete'),
('Buzzywuzzy87','Sonic 2','Genesis','Complete'),
('Buzzywuzzy87','Sonic 3','Genesis','Complete'),
('Buzzywuzzy87','Sonic and Knuckles','Genesis','Complete'),
('Buzzywuzzy87','Sonic and Knuckles/Sonic 3','Genesis','Complete'),
('Buzzywuzzy87','Super Mario World','SNES','Complete'),
('Buzzywuzzy87','Doom Eternal','Switch','Complete'),
('Buzzywuzzy87','Luigi''s Mansion 3','Switch','Complete'),
('Buzzywuzzy87','Battletoads','NES','Not Complete'),
('Buzzywuzzy87','Nier: Automata','Xbox One','Not Complete'),
('Buzzywuzzy87','Chrono Trigger','SNES','Not Complete');

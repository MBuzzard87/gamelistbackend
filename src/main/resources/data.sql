
DROP TABLE IF EXISTS game_list;

CREATE TABLE game_list
(
    id int AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(250) NOT NULL,
    name VARCHAR(250) NOT NULL,
    console VARCHAR(250) NOT NULL,
    is_complete VARCHAR(250) NOT NULL

);


INSERT INTO game_list (username,name,console,is_complete)VALUES
('Buzzywuzzy87','LittleSamson','NES','Yes'),
('Buzzywuzzy87','SuperCastlevaniaIV','SNES','Yes'),
('Buzzywuzzy87','SuperMetroid','SNES','Yes'),
('Buzzywuzzy87','MegaMan','NES','Yes'),
('Buzzywuzzy87','SonictheHedgehog','Genesis','Yes'),
('Buzzywuzzy87','CrusaderofCenty','Genesis','No'),
('Buzzywuzzy87','Castlevania:SymphonyoftheNight','Playstation1','No');
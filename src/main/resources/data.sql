DROP TABLE IF EXISTS gamelist;

CREATE TABLE  gamelist
(
    id        int AUTO_INCREMENT PRIMARY KEY,
    username     VARCHAR(250)   NOT NULL,
    name     VARCHAR(250)   NOT NULL,
    console   VARCHAR(250)   NOT NULL,
    isComplete   BIT   NOT NULL

);

INSERT INTO gamelist (username, name, console, isComplete) VALUES
('Buzzywuzzy87', 'Little Samson', 'NES', TRUE),
('Buzzywuzzy87', 'Super Castlevania IV', 'SNES', TRUE),
('Buzzywuzzy87', 'Super Metroid', 'SNES', TRUE),
('Buzzywuzzy87', 'Mega Man', 'NES', TRUE),
('Buzzywuzzy87', 'Sonic the Hedgehog', 'Genesis', TRUE),
('Buzzywuzzy87', 'Crusader of Centy', 'Genesis', FALSE),
('Buzzywuzzy87', 'Castlevania: Symphony of the Night', 'Playstation 1', FALSE);
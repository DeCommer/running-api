/*
DB schema
*/
DROP TABLE IF EXISTS run_data;
DROP TABLE IF EXISTS run_data_seq;
CREATE DATABASE running;
USE running;

-- DESCRIBE run_data;

CREATE TABLE run_data 
(
    id	BIGINT AUTO_INCREMENT NOT NULL,
    weekday			VARCHAR(255),
    month		VARCHAR(255),
    dom			INT,
    year		VARCHAR(255),
    avg_pace	VARCHAR(255),
    distance	DECIMAL(4,2),
    duration	TIME,
    calories	INT,
    PRIMARY KEY (id)
);

--insert your own data in this format:

INSERT INTO run_data (weekday, month, dom, year, avg_pace, distance, duration, calories) VALUES ('Saturday', 'September', '7', '2024', '7`58``', '6.28', '00:50:03', '786');


SELECT * FROM run_data;
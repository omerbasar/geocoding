-- sql for towns.txt
SELECT id, name FROM town WHERE city_id = 34;

-- sql for districts.txt 
SELECT id, name, town_id FROM district WHERE FLOOR(town_id / 1000) = 34;

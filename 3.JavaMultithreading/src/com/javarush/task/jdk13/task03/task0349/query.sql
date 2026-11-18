-- Write your code here:
WITH tempTable (averageDOB) AS (SELECT AVG(year_born) FROM film_directors)
SELECT film_directors.id,
       film_directors.full_name,
       film_directors.year_born
FROM film_directors,
     tempTable
WHERE film_directors.year_born < tempTable.averageDOB;

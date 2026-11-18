-- Write your code here:
SELECT * FROM film_directors
RIGHT JOIN (
      SELECT title, director_id FROM films AS film
                   WHERE year_released > 1990

) year ON film_directors.id = year.director_id
WHERE film_directors.country ='USA'
LIMIT 5;
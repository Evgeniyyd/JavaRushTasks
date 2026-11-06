-- Write your code here:
SELECT full_name FROM film_directors
LEFT JOIN (SELECT title, director_id
          FROM films AS f
          WHERE  genre LIKE 'comedy')
AS film ON film_directors.id = film.director_id;
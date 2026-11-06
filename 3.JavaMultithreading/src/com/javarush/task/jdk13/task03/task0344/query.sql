-- Write your code here:
SELECT title FROM films
LEFT JOIN (SELECT director.last_name, director.id
           FROM film_directors AS director
                WHERE last_name LIKE 'Spielberg')
AS film ON films.director_id = film.id;

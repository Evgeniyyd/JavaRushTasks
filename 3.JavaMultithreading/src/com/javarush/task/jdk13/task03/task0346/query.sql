-- Write your code here:
SELECT *
FROM films
         JOIN
     (SELECT director.year_born, director.id
      FROM film_directors AS director
      WHERE year_born < 1940)
         AS year ON year.id = films.director_id
WHERE genre = 'sci-fi';


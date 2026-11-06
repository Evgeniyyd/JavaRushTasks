-- Write your code here:
SELECT film_directors.last_name FROM film_directors
LEFT JOIN (SELECT films.grossed,director_id FROM films
                                WHERE grossed >100)
 AS film ON id = director_id
WHERE country LIKE 'UK';
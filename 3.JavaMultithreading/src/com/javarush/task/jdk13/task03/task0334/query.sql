-- Write your code here:
SELECT authors.last_name AS 'author',
       authors.country   AS 'author_country',
       books.genre       AS 'book_genre'
FROM books
         LEFT JOIN authors ON authors.author_id = books.author_id
WHERE books.genre = 'fantasy'
GROUP BY books.genre, authors.country, authors.last_name
ORDER BY authors.country ASC
LIMIT 5;
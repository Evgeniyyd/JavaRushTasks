-- Write your code here:
SELECT authors.last_name AS 'author',
       authors.country   AS 'author_country',
       books.genre       AS 'book_genre'
FROM books
         LEFT JOIN authors ON authors.author_id = books.author_id
WHERE genre = 'fantasy'
GROUP BY last_name, country, genre
ORDER BY country ASC
LIMIT 5;
-- Write your code here:
SELECT authors.last_name AS 'author',
       books.genre AS 'genre',
       books.date_released AS 'book_genre'
FROM books
JOIN authors ON authors.author_id = books.author_id
WHERE date_released < 1900;
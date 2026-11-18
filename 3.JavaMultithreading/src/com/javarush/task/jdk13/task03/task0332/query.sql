-- Write your code here:
SELECT auth.last_name author,
       book.genre book_genre,
       book.date_released
FROM authors AS auth
RIGHT JOIN  books AS book  ON auth.author_id = book.author_id
WHERE book.date_released < 1900
GROUP BY book.genre, auth.last_name, book.date_released;
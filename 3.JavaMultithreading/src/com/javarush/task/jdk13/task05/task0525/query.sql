-- Write your code here:
SELECT author.full_name, COUNT(book.author_id) AS books
FROM book
         JOIN author on book.author_id = author.id
GROUP BY author.full_name
HAVING COUNT(author_id) > 1;
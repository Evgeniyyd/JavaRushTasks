-- Write your code here:
SELECT authors.* FROM books
                 JOIN authors ON authors.author_id = books.author_id
WHERE  books.author_id != 7
AND title NOT LIKE 'War and Peace';
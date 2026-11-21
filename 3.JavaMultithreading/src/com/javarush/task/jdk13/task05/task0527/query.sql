-- Write your code here:
SELECT DISTINCT book.title
FROM book
JOIN author ON book.author_id = author.id
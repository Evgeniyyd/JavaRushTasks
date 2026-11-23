-- Write your code here:
SELECT  author.full_name, COUNT(DISTINCT publisher.name) FROM author
 LEFT JOIN book ON author.id = book.author_id
LEFT JOIN publisher  on publisher.id = book.publisher_id
GROUP BY author.full_name;
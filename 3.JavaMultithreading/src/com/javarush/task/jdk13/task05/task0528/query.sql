-- Write your code here:
SELECT DISTINCT publisher.name FROM book
JOIN publisher
         ON book.publisher_id = publisher.id
JOIN author
ON book.author_id = author.id
WHERE author.full_name LIKE '%Mark Twain%';
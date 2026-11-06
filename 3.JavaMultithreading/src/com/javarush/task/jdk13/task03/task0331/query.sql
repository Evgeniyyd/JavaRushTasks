-- Write your code here:
SELECT authors.last_name AS 'author',
       books.title AS 'book_title',
       books.copies_sold_millions AS 'books_sold'
FROM authors
         RIGHT JOIN books ON authors.author_id = books.author_id
WHERE copies_sold_millions > 50;
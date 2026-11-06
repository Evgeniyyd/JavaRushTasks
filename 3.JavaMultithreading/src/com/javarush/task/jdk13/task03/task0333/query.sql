-- Write your code here:
SELECT a.sex AS 'author_sex',
       a.country AS 'author_country',
       b.copies_sold_millions AS 'books_sold'
FROM books AS b
JOIN authors AS a ON a.author_id = b.author_id
WHERE copies_sold_millions >10
GROUP BY sex,country,copies_sold_millions
ORDER BY copies_sold_millions DESC;

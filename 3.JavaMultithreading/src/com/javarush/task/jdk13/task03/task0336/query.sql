-- Write your code here:
SELECT authors.year_born
FROM authors,books
WHERE year_born <=  (SELECT MAX(books.date_released) FROM books);
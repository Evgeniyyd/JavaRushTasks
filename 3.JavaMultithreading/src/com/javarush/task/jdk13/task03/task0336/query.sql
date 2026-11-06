-- Write your code here:
SELECT authors.year_born, MAX(books.date_released)
FROM authors,books
WHERE year_born <= books.date_released
GROUP BY authors.year_born;
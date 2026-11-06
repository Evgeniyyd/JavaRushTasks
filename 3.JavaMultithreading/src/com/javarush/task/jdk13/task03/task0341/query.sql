-- Write your code here:
SELECT * FROM films
 WHERE title LIKE
          (SELECT title FROM films
                     WHERE title LIKE 'The%'
                       AND title LIKE '%r'
           LIMIT 1);
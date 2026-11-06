-- Write your code here:
SELECT *
FROM authors
WHERE avtor_id IN
      (SELECT author_id FROM books WHERE genre LIKE 'fantasy');

-- Write your code here:
SELECT book.isbn,
       book.title,
       author.full_name,
       book.publisher_id,
       book.publication_year
FROM book
         JOIN author
              ON book.author_id = author.id

JOIN publisher
          ON book.publisher_id = publisher.id
ORDER BY publication_year DESC;

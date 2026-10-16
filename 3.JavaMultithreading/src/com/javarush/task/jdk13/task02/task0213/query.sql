-- Write your code here:
SELECT is_full_time,
       CASE is_full_time
           WHEN is_full_time = 0 THEN false
           WHEN is_full_time = 1 THEN true
           END
FROM students

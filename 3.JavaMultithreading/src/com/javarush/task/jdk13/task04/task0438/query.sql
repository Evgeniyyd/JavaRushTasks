-- Write your code here:
SELECT CASE
           WHEN position LIKE '%developer%'
                    AND position NOT LIKE '%software developer%'THEN
               REPLACE(position, 'developer', 'software developer')
           ELSE position
           END AS position
FROM employee;




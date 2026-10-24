-- Write your code here:
SELECT year(date_of_birth), month(date_of_birth)
FROM employee
WHERE  MONTH(date_of_birth) IN (12,1,2)
ORDER BY MONTH(date_of_birth) DESC;

-- Write your code here:
SELECT YEAR(date_of_birth), COUNT(date_of_birth)
FROM employee
GROUP BY date_of_birth;
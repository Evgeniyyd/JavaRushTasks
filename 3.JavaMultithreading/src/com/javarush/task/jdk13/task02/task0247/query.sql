-- Write your code here:
SELECT department, position, COUNT(*) AS 'total'
FROM employee
GROUP BY department, position
HAVING total LIKE 1
ORDER BY department;
-- Write your code here:
SELECT department, position, COUNT(*) AS 'total'
FROM employee
WHERE position LIKE 'backend developer'
GROUP BY department, position
HAVING  total =1
ORDER BY department;
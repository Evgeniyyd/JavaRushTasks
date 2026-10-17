-- Write your code here:
SELECT department, COUNT(position)
FROM employee
WHERE position = 'backend developer'
GROUP BY department;
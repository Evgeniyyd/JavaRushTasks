-- Write your code here:
SELECT department, COUNT(position)
FROM employee
GROUP BY department;
-- Write your code here:
SELECT department, position, COUNT(position)
FROM employee
GROUP BY department,position;
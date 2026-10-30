-- Write your code here:
SELECT department AS 'department_name',
       COUNT(*) AS 'count'
FROM employee
WHERE department = 'frontend developer' OR  department = 'backend developer'
GROUP BY department;
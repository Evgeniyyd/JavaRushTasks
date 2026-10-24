-- Write your code here:
SELECT department AS 'department_name', COUNT('frontend developer') AS 'count'
FROM employee
WHERE position = 'frontend developer'
GROUP BY department
ORDER BY count DESC;

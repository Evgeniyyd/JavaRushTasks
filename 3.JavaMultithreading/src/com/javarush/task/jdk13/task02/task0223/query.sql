-- Write your code here:
SELECT department, count(department)
FROM employee
GROUP BY(department)
ORDER BY(COUNT(department)) DESC;

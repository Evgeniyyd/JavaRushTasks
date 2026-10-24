-- Write your code here:
SELECT department AS 'department_name',
       COUNT('frontend developer')
           OR COUNT('backend developer') AS 'count'
FROM employee
GROUP BY department;
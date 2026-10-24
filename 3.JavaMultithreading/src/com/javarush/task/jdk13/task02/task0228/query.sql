-- Write your code here:
SELECT department, COUNT(department) AS 'number_of_employees'
FROM employee
GROUP BY department;

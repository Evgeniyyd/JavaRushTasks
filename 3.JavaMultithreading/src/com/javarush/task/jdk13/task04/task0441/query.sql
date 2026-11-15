-- Write your code here:
SELECT employee.name_b64,
       CAST(FROM_BASE64(name_b64) AS CHAR ) AS name
FROM employee;
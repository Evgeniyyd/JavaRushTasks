-- Write your code here:
SELECT name,
       TO_BASE64(name) AS base64
FROM employee;
-- Write your code here:
SELECT YEAR(date_of_birth)  AS 'prod_year',
       MONTH(date_of_birth) AS 'prod_month',
       COUNT(YEAR(date_of_birth)),
       COUNT(MONTH(date_of_birth))
FROM employee
GROUP BY prod_year, prod_month;


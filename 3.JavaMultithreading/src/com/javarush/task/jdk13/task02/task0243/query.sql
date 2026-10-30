-- Write your code here:
SELECT YEAR(date_of_birth)  AS 'prod_year',
       MONTH(date_of_birth) AS 'prod_month'
FROM employee
GROUP BY prod_year, prod_month
ORDER BY prod_year DESC;


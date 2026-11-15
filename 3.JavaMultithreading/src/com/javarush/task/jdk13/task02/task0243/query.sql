-- Write your code here:
SELECT YEAR(prod_date)  AS 'prod_year',
       MONTH(prod_date) AS 'prod_month',
     count(prod_date)
FROM employee
GROUP BY prod_year, prod_month
ORDER BY prod_year DESC;


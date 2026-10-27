-- Write your code here:
SELECT YEAR(prod_date)  AS 'prod_year',
       MONTH(prod_date) AS 'prod_month',
       COUNT(*)
FROM cars
WHERE price > 99000
  AND name LIKE '%Black Car%'
GROUP BY prod_year, prod_month;
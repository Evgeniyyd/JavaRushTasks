-- Write your code here:
SELECT prod_year, COUNT(prod_year)
FROM cars
GROUP BY prod_year
ORDER BY prod_year DESC;




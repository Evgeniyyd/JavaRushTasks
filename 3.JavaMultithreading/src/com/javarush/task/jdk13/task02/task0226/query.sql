-- Write your code here:
SELECT prod_year, count(prod_year)
FROM cars
WHERE prod_year =2021
GROUP BY prod_year;

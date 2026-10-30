-- Write your code here:
SELECT prod_year, COUNT(prod_year) AS 'car_count'
FROM cars
GROUP BY prod_year;
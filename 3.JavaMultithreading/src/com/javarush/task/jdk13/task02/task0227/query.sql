-- Write your code here:
SELECT prod_year, COUNT(prod_year) AS 'car_count'
FROM cars
WHERE prod_year
GROUP BY prod_year;
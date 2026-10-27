-- Write your code here:
SELECT name, COUNT(name) AS 'car_count'
FROM cars
GROUP BY name
HAVING car_count > 3
ORDER BY car_count;

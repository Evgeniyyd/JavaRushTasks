-- Write your code here:
SELECT name AS 'car_name', COUNT(name) AS 'car_count'
FROM cars
GROUP BY name;
-- Write your code here:
SELECT name, COUNT(name)
FROM cars
GROUP BY name;

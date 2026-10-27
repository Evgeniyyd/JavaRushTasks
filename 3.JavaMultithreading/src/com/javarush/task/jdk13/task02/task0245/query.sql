-- Write your code here:
SELECT name, COUNT(name)
FROM cars
GROUP BY name
HAVING COUNT(name) > 1
ORDER BY name;

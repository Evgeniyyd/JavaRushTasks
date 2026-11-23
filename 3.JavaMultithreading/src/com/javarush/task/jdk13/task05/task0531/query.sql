-- Write your code here:
SELECT * FROM object
WHERE  YEAR(object.discovery_date) >= 2010 AND
      YEAR(object.discovery_date) <= 2020;
SELECT * FROM object
WHERE discovery_date BETWEEN '2010-01-01' AND '2020-12-31';
-- Write your code here:
SELECT lego_set.number,ROUND(inventory * 1.01,0) AS with_spare_parts
FROM lego_set;
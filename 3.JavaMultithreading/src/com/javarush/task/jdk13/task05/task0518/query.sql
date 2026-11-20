-- Write your code here:
SELECT lego_set.released , COUNT(inventory) AS total
FROM lego_set
GROUP BY  released
ORDER BY released DESC;
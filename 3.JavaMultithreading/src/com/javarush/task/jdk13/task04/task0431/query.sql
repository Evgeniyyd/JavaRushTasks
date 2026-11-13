-- Write your code here:
SELECT DAYNAME(event.date), COUNT(*) FROM event
WHERE type LIKE 'REGISTRATION'
GROUP BY DAYNAME(event.date)
ORDER BY COUNT(*) DESC
LIMIT 1;
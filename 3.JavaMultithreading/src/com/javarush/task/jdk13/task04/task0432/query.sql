-- Write your code here:
SELECT MONTHNAME(event.date),COUNT(*) FROM event
WHERE status LIKE 'ERROR' OR status LIKE 'FAILED'
GROUP BY MONTHNAME(event.date)
ORDER BY COUNT(*) DESC
LIMIT 1;
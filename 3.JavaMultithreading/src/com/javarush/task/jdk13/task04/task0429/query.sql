-- Write your code here:
SELECT * FROM event
WHERE DATE_SUB(now(), INTERVAL 2 WEEK) <= date_time;
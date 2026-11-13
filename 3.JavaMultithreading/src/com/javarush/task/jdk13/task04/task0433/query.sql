-- Write your code here:
SELECT YEAR(date),
       MONTH(date),
       DAY(date),
       COUNT(*) FROM event
WHERE user_id =3
AND type LIKE 'SOLVE_TASK' AND status LIKE 'OK'
GROUP BY YEAR(date), MONTH(date), DAY(date);
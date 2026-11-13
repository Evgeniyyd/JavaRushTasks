-- Write your code here:
SELECT * FROM event
    WHERE DATEDIFF(event.date_time,CURDATE()) <= 20;
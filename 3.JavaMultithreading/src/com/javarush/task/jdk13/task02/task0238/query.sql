-- Write your code here:
SELECT   MONTH(date_of_birth),
        YEAR(date_of_birth) FROM employee
GROUP BY date_of_birth
ORDER BY date_of_birth DESC;
-- Write your code here:
SELECT  COUNT(1),
    IF(is_full_time, 'yes','no')
FROM students
GROUP BY IF(is_full_time, 'yes','no');


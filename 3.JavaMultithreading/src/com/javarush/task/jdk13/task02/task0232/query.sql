-- Write your code here:
SELECT students.is_full_time, COUNT(is_full_time)
FROM students
WHERE is_full_time = 1
   OR is_full_time = 0
GROUP BY is_full_time;


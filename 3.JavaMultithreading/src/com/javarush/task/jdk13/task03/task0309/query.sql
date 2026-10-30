-- Write your code here:
SELECT gyms.location AS 'gym', customers.location AS 'person'
FROM customers,
     gyms
WHERE gyms.location NOT IN ('London')
  AND customers.location NOT IN ('London')
GROUP BY gym , person;

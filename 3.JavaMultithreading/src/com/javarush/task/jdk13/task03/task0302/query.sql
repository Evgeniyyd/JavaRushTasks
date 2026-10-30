-- Write your code here:
SELECT *
FROM gyms,
     customers
WHERE gyms.location LIKE '%London%'
  AND customers.location LIKE '%London%';
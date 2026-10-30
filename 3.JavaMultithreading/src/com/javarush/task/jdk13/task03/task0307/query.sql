-- Write your code here:
SELECT gyms.id, gyms.name AS 'gym', customers.id AS 'cust'
FROM customers, gyms
WHERE customers.id < 50;
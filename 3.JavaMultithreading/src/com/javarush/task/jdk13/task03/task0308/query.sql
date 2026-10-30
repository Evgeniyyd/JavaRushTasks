-- Write your code here:
SELECT gyms.location AS 'g',
       customers.name, customers.email, customers.telephone AS 'person'
FROM customers,
     gyms
WHERE customers.name LIKE 'Hulk';

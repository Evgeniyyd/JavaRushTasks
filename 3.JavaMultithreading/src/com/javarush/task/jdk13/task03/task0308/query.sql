-- Write your code here:
SELECT g.location ,
       person.name, person.email, person.telephone
FROM customers AS person,
     gyms AS g
WHERE person.name LIKE 'Hulk';

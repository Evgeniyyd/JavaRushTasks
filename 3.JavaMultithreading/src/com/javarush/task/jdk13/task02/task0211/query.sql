-- Write your code here:
SELECT age, IF(age <=12, 'child',IF(age >=20, 'adult','teenager'))
AS    customer_name
FROM customers
LIMIT 5;

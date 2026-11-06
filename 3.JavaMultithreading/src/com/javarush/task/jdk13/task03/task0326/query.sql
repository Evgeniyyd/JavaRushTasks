-- Write your code here:
SELECT customers.email, orders.*
FROM orders
RIGHT JOIN customers ON customers.customer_id = orders.customer_id;
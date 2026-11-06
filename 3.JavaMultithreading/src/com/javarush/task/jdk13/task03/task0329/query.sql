-- Write your code here:
SELECT c.customer_id, o.order_status
FROM orders AS o
JOIN customers AS  c ON c.customer_id = o.customer_id;
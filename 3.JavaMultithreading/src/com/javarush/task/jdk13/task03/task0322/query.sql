-- Write your code here:
SELECT c.customer_id,
       c.email,
       o.order_id,
       o.order_status
 FROM orders AS o
            JOIN customers AS c ON o.customer_id = c.customer_id
WHERE order_status LIKE 'PAID' OR 'PROCESSING';
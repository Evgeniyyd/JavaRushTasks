-- Write your code here:
SELECT customers.city, orders.store_id
FROM orders
         RIGHT JOIN customers on customers.customer_id = orders.customer_id
WHERE orders.order_status LIKE 'SHIPPED'
  AND orders.total_cost > 100;
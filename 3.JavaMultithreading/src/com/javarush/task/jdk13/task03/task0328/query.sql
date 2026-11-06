-- Write your code here:
SELECT customers.phone AS 'cust_phone',
       orders.order_date,
       orders.total_cost,
       orders.store_id
FROM orders
         RIGHT JOIN customers ON customers.customer_id = orders.customer_id
WHERE customers.city LIKE 'New York' AND
   orders.order_status = 'PROCESSING';

-- Write your code here:
SELECT customers.last_name AS 'surname', orders.order_id
FROM orders
         LEFT JOIN test.customers
             ON customers.customer_id = orders.customer_id;

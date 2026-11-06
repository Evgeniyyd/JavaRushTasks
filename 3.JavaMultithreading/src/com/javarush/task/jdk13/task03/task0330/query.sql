-- Write your code here:
SELECT customers.zip_code AS 'cust_zip_code', orders.order_status AS 'status'
FROM orders
LEFT JOIN customers ON  customers.customer_id = orders.customer_id;
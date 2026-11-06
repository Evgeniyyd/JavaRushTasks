-- Write your code here:
SELECT c.zip_code, o.order_id
FROM orders AS o
         LEFT JOIN customers AS c ON c.customer_id = o.customer_id
WHERE o.shipped_date IS NOT NULL
  AND o.store_id = 27;

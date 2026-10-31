-- Write your code here:
SELECT * FROM customers
           JOIN orders ON customers.customer_id = orders.customer_id
WHERE total_cost > 100;
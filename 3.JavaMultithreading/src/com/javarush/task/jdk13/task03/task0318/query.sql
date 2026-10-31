-- Write your code here:
SELECT top_retailers.ret_name,
       top_retailers.ret_revenue,
       suppliers.sup_name,
       suppliers.sup_revenue
FROM  suppliers
         JOIN top_retailers
             ON top_retailers.ret_revenue = suppliers.sup_revenue;

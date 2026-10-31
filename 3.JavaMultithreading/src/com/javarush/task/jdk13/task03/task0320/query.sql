-- Write your code here:
SELECT retailer.ret_name,
       retailer.ret_revenue,
       supplier.sup_name,
       supplier.sup_revenue
FROM suppliers AS supplier
         JOIN top_retailers AS retailer ON ret_revenue = sup_revenue
WHERE sup_revenue > 50;

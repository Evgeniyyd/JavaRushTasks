-- Write your code here:
SELECT *
FROM suppliers
         JOIN top_retailers
              ON top_retailers.ret_location = suppliers.sup_country;
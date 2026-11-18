-- Write your code here:
SELECT r.ret_name,r.ret_location,s.sup_name,s.sup_country
FROM suppliers AS s
JOIN top_retailers AS r
    ON r.ret_location = s.sup_country;
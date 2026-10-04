-- Write your code here:
SELECT  country_code, ip_from, ip_to FROM ip2country
ORDER BY id
    LIMIT 1000
OFFSET 78;
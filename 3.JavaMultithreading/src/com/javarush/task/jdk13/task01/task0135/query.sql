-- Write your code here:
SELECT country_code, ip_from, ip_to
FROM ip2country
WHERE country_code = 'DE'
LIMIT 3 OFFSET 5;


-- Write your code here:
SELECT object.name, YEAR(object.discovery_date) AS d_year,
       MONTH(object.discovery_date) AS d_month,
        DAY(object.discovery_date) AS d_day FROM object
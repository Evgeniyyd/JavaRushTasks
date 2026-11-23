-- Write your code here:
SELECT CONCAT(CONCAT_WS(', ',lego_set.number, lego_set.name))
FROM lego_set
ORDER BY CHAR_LENGTH(name) ASC;

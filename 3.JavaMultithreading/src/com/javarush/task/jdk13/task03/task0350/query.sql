-- Write your code here:
WITH tempTable (averageGrossed) AS (SELECT AVG(grossed) FROM films),
 tempTable2 (averageYearReleased )  AS (SELECT AVG(year_released) FROM films)
SELECT films.title,
       films.genre,
       films.year_released
FROM tempTable,tempTable2,films
WHERE films.grossed > tempTable.averageGrossed AND
      films.year_released > tempTable2.averageYearReleased
GROUP BY films.title, films.genre, films.year_released;



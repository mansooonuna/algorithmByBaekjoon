WITH T_VIEW AS (
    SELECT 
        ID
        ,MAX(SIZE_OF_COLONY) OVER (PARTITION BY YEAR(DIFFERENTIATION_DATE)) AS YEAR_MAX
    FROM ECOLI_DATA
)
SELECT 
    YEAR(E.DIFFERENTIATION_DATE) AS YEAR
    ,(T.YEAR_MAX - E.SIZE_OF_COLONY) AS YEAR_DEV
    ,E.ID
FROM ECOLI_DATA E
JOIN T_VIEW T
ON T.ID = E.ID

ORDER BY YEAR, YEAR_DEV
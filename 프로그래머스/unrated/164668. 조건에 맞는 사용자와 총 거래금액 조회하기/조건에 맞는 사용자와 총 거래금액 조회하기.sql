SELECT UGU.USER_ID, UGU.NICKNAME, UGB.TOT_PRICE
FROM USED_GOODS_USER UGU
INNER JOIN (SELECT WRITER_ID, SUM(PRICE) AS TOT_PRICE
FROM USED_GOODS_BOARD
WHERE STATUS = 'DONE'
GROUP BY WRITER_ID
HAVING SUM(PRICE) >= 700000) UGB
ON UGU.USER_ID = UGB.WRITER_ID
ORDER BY UGB.TOT_PRICE










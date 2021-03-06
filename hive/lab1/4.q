USE lab1;

SELECT c.desc AS carrier, COUNT(*) AS flights
FROM carriers AS c
JOIN flights AS f
ON c.code = f.carrier
GROUP BY c.desc
SORT BY flights DESC
LIMIT 1;
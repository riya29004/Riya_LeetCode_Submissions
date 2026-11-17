with coll as(
    SELECT requester_id AS id
    FROM RequestAccepted
    UNION ALL 
    SELECT accepter_id AS id 
    FROM RequestAccepted
)
SELECT id , COUNT(*) AS num
FROM coll
GROUP BY 1
ORDER BY 2 DESC
LIMIT 1;


#coll name se ek column bnali jisme saare id's h (requester , accepter) now we r using it to build yield the answer 
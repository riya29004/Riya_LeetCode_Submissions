SELECT p.product_name, temp.total as unit FROM Products p
LEFT JOIN 
(SELECT product_id, SUM(unit) AS total FROM Orders WHERE order_date LIKE '2020-02-%' GROUP BY product_id HAVING total >= 100) AS temp
ON p.product_id = temp.product_id
WHERE temp.total IS NOT NULL;
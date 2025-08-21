-- 코드를 입력하세요
SELECT flavor
FROM (
  SELECT flavor, SUM(total_order) AS total
      FROM (
        SELECT flavor, total_order FROM first_half
        UNION ALL
        SELECT flavor, total_order FROM july
      )
      GROUP BY flavor
      ORDER BY total DESC, flavor ASC
)
WHERE ROWNUM <= 3;
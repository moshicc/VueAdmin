# 获取表
SELECT
*
FROM
information_schema. TABLES
WHERE
TABLE_SCHEMA = (SELECT DATABASE());

# 获取字段
SELECT
*
FROM
information_schema. COLUMNS
WHERE
TABLE_SCHEMA = (SELECT DATABASE())
AND TABLE_NAME = "sys_user";

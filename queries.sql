## Part 1: Test it with SQL
id       int
employer varchar(255)
name     varchar(255)
skills   varchar(255)

## Part 2: Test it with SQL
SELECT *
FROM techjobs.employer
WHERE location = 'St. Louis City';

## Part 3: Test it with SQL
DROP TABLE `techjobs`.`job`;

## Part 4: Test it with SQL
SELECT DISTINCT name,description
FROM skill
INNER JOIN skill_jobs
ON skill.id = skill_jobs.skills_id
ORDER BY name asc;
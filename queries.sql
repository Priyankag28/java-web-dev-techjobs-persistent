## Part 1: Test it with SQL
id INT
employer varchar(255)
name    varchar(255)
skills  varchar(255)

## Part 2: Test it with SQL
select * from techjobs.employer
where location = 'St. Louis City'

## Part 3: Test it with SQL
drop table techjobs.job;

## Part 4: Test it with SQL
select distinct name, description from techjobs.skill
INNER JOIN techjobs.job_skills on skill.id = job_skills.skills_id
order by name asc
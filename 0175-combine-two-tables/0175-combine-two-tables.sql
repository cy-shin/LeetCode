/* Write your PL/SQL query statement below */
SELECT firstName, lastName,
       (SELECT city from Address A WHERE P.personId = A.personId) as city,
       (SELECT state from Address A WHERE P.personId = A.personId) as state
FROM Person P;
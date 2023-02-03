SELECT firstName, lastName, city, state
FROM "PERSON" P
LEFT JOIN "ADDRESS" A USING(personId);
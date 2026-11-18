-- Write your code here:
SELECT gym.location, person.location
FROM customers AS person,
     gyms  AS gym
WHERE person.location NOT IN ('London')
GROUP by gym.location, person.location;

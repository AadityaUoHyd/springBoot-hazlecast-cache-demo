# How and why to implement caching in your application?

#Even Hibernate ORM framework does provide 1st level cache, but issue is.. its don't follow evict policies. Cache makes our project efficient by speed up output.

#Here I try to implement basic demo level hazlecast cache, where for 1st time hitting DB you can see console "Hitting DB for 1st time, from getUsers() method".
Next time when we hit same url, we don't get output in console, means its not hitting code again rather taking data from hazlecast cache.

#Kindly keep in mind for testing purpose, after creation of usersdb by spring-boot, I'd inserted few data in 'user' table of usersdb manually.

#Use url to fetch data from MySQL (DB name : usersdb): http://localhost:9090/cache/api/v1/getAllUsers

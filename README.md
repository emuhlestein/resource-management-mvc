# Resource Management
This is a project that manages resources.  

This is also a project to learn Spring Boot, Spring MVC, JPA, and JSP.  
    
I started off using Thymeleaf as the html rendering engine, but have decided to go with JSP. This seems to be more
widely used.  

#### TODO
1. Get schema.sql working-should create tables.
2. Get properties from app.properties to configure data source.

schema.sql
```$xslt
create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);
```
src/main/resources/data.sql - this file is executed when the application is launched.  
This is an auto configuration feature provided by Spring Boot.
```$xslt
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10001,  'Ranga', 'Hyderabad',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10002,  'James', 'New York',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10003,  'Pieter', 'Amsterdam',sysdate());
```

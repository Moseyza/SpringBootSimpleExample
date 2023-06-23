create table repository(
                           id int auto_increment ,
                           repositoryId int not null,
                           nodeId varchar(255)  null,
                           name varchar(255) not null ,
                           fullName varchar(500) not null,
                           htmlUrl varchar(500) null,
                           description varchar(500) null
);


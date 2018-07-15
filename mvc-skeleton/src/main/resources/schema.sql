drop table if exists t_user;

create table t_user (
  id identity,
  username varchar(25) not null,
  password varchar(25) not null
);




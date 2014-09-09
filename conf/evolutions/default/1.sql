# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table account (
  id                        integer not null,
  username                  varchar(255),
  real_name                 varchar(255),
  password                  varchar(255),
  email                     varchar(255),
  security_question         varchar(255),
  security_answer           varchar(255),
  constraint pk_account primary key (id))
;

create table person (
  id                        integer not null,
  name                      varchar(255),
  constraint pk_person primary key (id))
;

create table role (
  id                        integer not null,
  role_name                 varchar(255),
  constraint pk_role primary key (id))
;


create table account_role (
  account_id                     integer not null,
  role_id                        integer not null,
  constraint pk_account_role primary key (account_id, role_id))
;
create sequence account_seq;

create sequence person_seq;

create sequence role_seq;




alter table account_role add constraint fk_account_role_account_01 foreign key (account_id) references account (id);

alter table account_role add constraint fk_account_role_role_02 foreign key (role_id) references role (id);

# --- !Downs

drop table if exists account cascade;

drop table if exists account_role cascade;

drop table if exists person cascade;

drop table if exists role cascade;

drop sequence if exists account_seq;

drop sequence if exists person_seq;

drop sequence if exists role_seq;


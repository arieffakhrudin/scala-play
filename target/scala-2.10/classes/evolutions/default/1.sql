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

create table card_data (
  id                        integer not null,
  data                      varchar(255),
  card_id                   integer,
  card_data_config_id       integer,
  constraint pk_card_data primary key (id))
;

create table card_distribution (
  id                        integer not null,
  distribution_date         date,
  distributed_by            varchar(255),
  card_id                   integer,
  card_holder_id            integer,
  constraint pk_card_distribution primary key (id))
;

create table card_state_history (
  id                        integer not null,
  change_date               date,
  change_by                 varchar(255),
  card_id                   integer,
  card_state_id             integer,
  constraint pk_card_state_history primary key (id))
;

create table data_preparation_log (
  id                        integer not null,
  prepare_date              date,
  prepared_by               varchar(255),
  card_id                   integer,
  constraint pk_data_preparation_log primary key (id))
;

create table personalization_job_detail (
  id                        integer not null,
  description               varchar(255),
  personalization_job_id    integer,
  card_id                   integer,
  constraint pk_personalization_job_detail primary key (id))
;

create table personalization_job_state_history (
  id                        integer not null,
  modified_by               varchar(255),
  modified_date             date,
  personalization_job_id    integer,
  personalization_job_state_id integer,
  constraint pk_personalization_job_state_his primary key (id))
;

create table personalization_log (
  id                        integer not null,
  perso_date                date,
  perso_by                  varchar(255),
  perso_result              integer,
  perso_log                 varchar(255),
  card_id                   integer,
  personalization_job_id    integer,
  constraint pk_personalization_log primary key (id))
;

create table privilege (
  id                        integer not null,
  role_id                   integer not null,
  module_name               varchar(255),
  create_access             boolean,
  read_access               boolean,
  update_access             boolean,
  delete_access             boolean,
  constraint pk_privilege primary key (id))
;

create table role (
  id                        integer not null,
  role_name                 varchar(255),
  constraint pk_role primary key (id))
;

create table transaction_data (
  id                        integer not null,
  transaction_data          varchar(255),
  transaction_history_id    integer,
  constraint pk_transaction_data primary key (id))
;

create table user_activity_log (
  id                        integer not null,
  account_id                integer not null,
  terminal                  integer,
  activity_date             date,
  activity                  varchar(255),
  constraint pk_user_activity_log primary key (id))
;

create table card (
  id                        integer not null,
  card_name                 varchar(255),
  card_state_id             integer,
  constraint pk_card primary key (id))
;

create table card_data_config (
  id                        integer not null,
  station_name              varchar(255),
  description               varchar(255),
  constraint pk_card_data_config primary key (id))
;

create table card_holder (
  id                        integer not null,
  name                      varchar(255),
  gender                    varchar(255),
  birth_date                date,
  address                   varchar(255),
  telephone                 varchar(255),
  personal_id_type          varchar(255),
  personal_id               varchar(255),
  occupation                varchar(255),
  constraint pk_card_holder primary key (id))
;

create table card_state (
  id                        integer not null,
  state_name                varchar(255),
  description               varchar(255),
  constraint pk_card_state primary key (id))
;

create table merchant (
  id                        integer not null,
  merchant_name             varchar(255),
  address                   varchar(255),
  description               varchar(255),
  constraint pk_merchant primary key (id))
;

create table personalization_config (
  id                        integer not null,
  profile_name              varchar(255),
  personalization_script    varchar(255),
  thermal_layout            varchar(255),
  emboss_layout             varchar(255),
  indent_layout             varchar(255),
  profile_state             integer,
  constraint pk_personalization_config primary key (id))
;

create table personalization_job (
  id                        integer not null,
  job_name                  varchar(255),
  personalization_config_id integer,
  personalization_station_id integer,
  personalization_job_state_id integer,
  constraint pk_personalization_job primary key (id))
;

create table personalization_job_state (
  id                        integer not null,
  state_name                varchar(255),
  description               varchar(255),
  constraint pk_personalization_job_state primary key (id))
;

create table personalization_station (
  id                        integer not null,
  station_name              varchar(255),
  ip_address                varchar(255),
  description               varchar(255),
  constraint pk_personalization_station primary key (id))
;

create table terminal (
  id                        integer not null,
  terminal_name             varchar(255),
  brand                     varchar(255),
  type                      varchar(255),
  description               varchar(255),
  ip_address                varchar(255),
  constraint pk_terminal primary key (id))
;

create table transaction_history (
  id                        integer not null,
  invoice_number            integer,
  transaction_type          varchar(255),
  transaction_date          date,
  debet                     integer,
  kredit                    integer,
  balance                   integer,
  merchant_id               integer,
  terminal_id               integer,
  card_id                   integer,
  constraint pk_transaction_history primary key (id))
;


create table account_role (
  account_id                     integer not null,
  role_id                        integer not null,
  constraint pk_account_role primary key (account_id, role_id))
;
create sequence account_seq;

create sequence card_data_seq;

create sequence card_distribution_seq;

create sequence card_state_history_seq;

create sequence data_preparation_log_seq;

create sequence personalization_job_detail_seq;

create sequence personalization_job_state_history_seq;

create sequence personalization_log_seq;

create sequence privilege_seq;

create sequence role_seq;

create sequence transaction_data_seq;

create sequence user_activity_log_seq;

create sequence card_seq;

create sequence card_data_config_seq;

create sequence card_holder_seq;

create sequence card_state_seq;

create sequence merchant_seq;

create sequence personalization_config_seq;

create sequence personalization_job_seq;

create sequence personalization_job_state_seq;

create sequence personalization_station_seq;

create sequence terminal_seq;

create sequence transaction_history_seq;

alter table card_data add constraint fk_card_data_card_1 foreign key (card_id) references card (id);
create index ix_card_data_card_1 on card_data (card_id);
alter table card_data add constraint fk_card_data_cardDataConfig_2 foreign key (card_data_config_id) references card_data_config (id);
create index ix_card_data_cardDataConfig_2 on card_data (card_data_config_id);
alter table card_distribution add constraint fk_card_distribution_card_3 foreign key (card_id) references card (id);
create index ix_card_distribution_card_3 on card_distribution (card_id);
alter table card_distribution add constraint fk_card_distribution_cardHolde_4 foreign key (card_holder_id) references card_holder (id);
create index ix_card_distribution_cardHolde_4 on card_distribution (card_holder_id);
alter table card_state_history add constraint fk_card_state_history_card_5 foreign key (card_id) references card (id);
create index ix_card_state_history_card_5 on card_state_history (card_id);
alter table card_state_history add constraint fk_card_state_history_cardStat_6 foreign key (card_state_id) references card_state (id);
create index ix_card_state_history_cardStat_6 on card_state_history (card_state_id);
alter table data_preparation_log add constraint fk_data_preparation_log_card_7 foreign key (card_id) references card (id);
create index ix_data_preparation_log_card_7 on data_preparation_log (card_id);
alter table personalization_job_detail add constraint fk_personalization_job_detail__8 foreign key (personalization_job_id) references personalization_job (id);
create index ix_personalization_job_detail__8 on personalization_job_detail (personalization_job_id);
alter table personalization_job_detail add constraint fk_personalization_job_detail__9 foreign key (card_id) references card (id);
create index ix_personalization_job_detail__9 on personalization_job_detail (card_id);
alter table personalization_job_state_history add constraint fk_personalization_job_state__10 foreign key (personalization_job_id) references personalization_job (id);
create index ix_personalization_job_state__10 on personalization_job_state_history (personalization_job_id);
alter table personalization_job_state_history add constraint fk_personalization_job_state__11 foreign key (personalization_job_state_id) references personalization_job_state (id);
create index ix_personalization_job_state__11 on personalization_job_state_history (personalization_job_state_id);
alter table personalization_log add constraint fk_personalization_log_card_12 foreign key (card_id) references card (id);
create index ix_personalization_log_card_12 on personalization_log (card_id);
alter table personalization_log add constraint fk_personalization_log_person_13 foreign key (personalization_job_id) references personalization_job (id);
create index ix_personalization_log_person_13 on personalization_log (personalization_job_id);
alter table privilege add constraint fk_privilege_role_14 foreign key (role_id) references role (id);
create index ix_privilege_role_14 on privilege (role_id);
alter table transaction_data add constraint fk_transaction_data_transacti_15 foreign key (transaction_history_id) references transaction_history (id);
create index ix_transaction_data_transacti_15 on transaction_data (transaction_history_id);
alter table user_activity_log add constraint fk_user_activity_log_account_16 foreign key (account_id) references account (id);
create index ix_user_activity_log_account_16 on user_activity_log (account_id);
alter table card add constraint fk_card_cardState_17 foreign key (card_state_id) references card_state (id);
create index ix_card_cardState_17 on card (card_state_id);
alter table personalization_job add constraint fk_personalization_job_person_18 foreign key (personalization_config_id) references personalization_config (id);
create index ix_personalization_job_person_18 on personalization_job (personalization_config_id);
alter table personalization_job add constraint fk_personalization_job_person_19 foreign key (personalization_station_id) references personalization_station (id);
create index ix_personalization_job_person_19 on personalization_job (personalization_station_id);
alter table personalization_job add constraint fk_personalization_job_person_20 foreign key (personalization_job_state_id) references personalization_job_state (id);
create index ix_personalization_job_person_20 on personalization_job (personalization_job_state_id);
alter table transaction_history add constraint fk_transaction_history_mercha_21 foreign key (merchant_id) references merchant (id);
create index ix_transaction_history_mercha_21 on transaction_history (merchant_id);
alter table transaction_history add constraint fk_transaction_history_termin_22 foreign key (terminal_id) references terminal (id);
create index ix_transaction_history_termin_22 on transaction_history (terminal_id);
alter table transaction_history add constraint fk_transaction_history_card_23 foreign key (card_id) references card (id);
create index ix_transaction_history_card_23 on transaction_history (card_id);



alter table account_role add constraint fk_account_role_account_01 foreign key (account_id) references account (id);

alter table account_role add constraint fk_account_role_role_02 foreign key (role_id) references role (id);

# --- !Downs

drop table if exists account cascade;

drop table if exists account_role cascade;

drop table if exists card_data cascade;

drop table if exists card_distribution cascade;

drop table if exists card_state_history cascade;

drop table if exists data_preparation_log cascade;

drop table if exists personalization_job_detail cascade;

drop table if exists personalization_job_state_history cascade;

drop table if exists personalization_log cascade;

drop table if exists privilege cascade;

drop table if exists role cascade;

drop table if exists transaction_data cascade;

drop table if exists user_activity_log cascade;

drop table if exists card cascade;

drop table if exists card_data_config cascade;

drop table if exists card_holder cascade;

drop table if exists card_state cascade;

drop table if exists merchant cascade;

drop table if exists personalization_config cascade;

drop table if exists personalization_job cascade;

drop table if exists personalization_job_state cascade;

drop table if exists personalization_station cascade;

drop table if exists terminal cascade;

drop table if exists transaction_history cascade;

drop sequence if exists account_seq;

drop sequence if exists card_data_seq;

drop sequence if exists card_distribution_seq;

drop sequence if exists card_state_history_seq;

drop sequence if exists data_preparation_log_seq;

drop sequence if exists personalization_job_detail_seq;

drop sequence if exists personalization_job_state_history_seq;

drop sequence if exists personalization_log_seq;

drop sequence if exists privilege_seq;

drop sequence if exists role_seq;

drop sequence if exists transaction_data_seq;

drop sequence if exists user_activity_log_seq;

drop sequence if exists card_seq;

drop sequence if exists card_data_config_seq;

drop sequence if exists card_holder_seq;

drop sequence if exists card_state_seq;

drop sequence if exists merchant_seq;

drop sequence if exists personalization_config_seq;

drop sequence if exists personalization_job_seq;

drop sequence if exists personalization_job_state_seq;

drop sequence if exists personalization_station_seq;

drop sequence if exists terminal_seq;

drop sequence if exists transaction_history_seq;


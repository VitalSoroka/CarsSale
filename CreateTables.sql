create database mydbauto;
create table account
(
  account_id int auto_increment
    primary key,
  login      varchar(45) null,
  password   varchar(45) null,
  constraint account_login_uindex
    unique (login)
);

create table brand
(
  brand_id int         not null
    primary key,
  name     varchar(45) null,
  constraint brand_name_UNIQUE
    unique (name)
);

create table user
(
  user_id    int auto_increment,
  name       varchar(45) null,
  lastname   varchar(45) null,
  account_id int         null,
  constraint id_user_UNIQUE
    unique (user_id),
  constraint account_id
    foreign key (account_id) references account (account_id)
);

alter table user
  add primary key (user_id);

create table auto
(
  auto_id       int auto_increment
    primary key,
  year_of_issue int         null,
  cost          double      null,
  color         varchar(45) null,
  mileage       int         null,
  type_fuel     varchar(45) null,
  engine_volume double      null,
  engine_power  int         null,
  drive_unit    varchar(45) null,
  transmission  varchar(45) null,
  user_id       int         null,
  brand_id      int         null,
  name_model    varchar(45) null,
  constraint brand_id
    foreign key (brand_id) references brand (brand_id),
  constraint user_id_auto
    foreign key (user_id) references user (user_id)
      on update cascade on delete cascade
);

create index brand_id_idx
  on auto (brand_id);

create index user_id_idx
  on auto (user_id);

create table phone
(
  phone_id int auto_increment
    primary key,
  number   varchar(45) null,
  user_id  int         null,
  constraint user_id
    foreign key (user_id) references user (user_id)
      on update cascade on delete cascade
);

create index user_id_idx
  on phone (user_id);



create table states(
state_id bigint primary key auto_increment,
state varchar(2)
);

create table matrialstatus(
matrialStatus_id bigint primary key auto_increment,
matrialStatus varchar(15) 
);

create table scholarity(
scholarity_id bigint primary key auto_increment,
scholarity varchar(20)
);

create table ProfileConf(
profileConf_id bigint primary key auto_increment,
Working boolean,
Home_Office boolean
);

create table Gender(
gender_id bigint primary key auto_increment,
gender varchar(15)
);

alter table addresses
add foreign key (state) references states(state_id);

alter table profiles
add foreign key (abilities_id) references abilities(code);

alter table profiles
add foreign key (profileConf) references ProFileConf(profileConf_id);

alter table persons
add foreign key (gender) references gender(gender_id)
on delete no action;
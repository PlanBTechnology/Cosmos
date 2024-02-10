create table states(
state_id bigint primary key auto_increment,
state varchar(2)
);

create table maritalstatus(
maritalStatus_id bigint primary key auto_increment,
maritalStatus varchar(15) 
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
create table job(
job_id bigint primary key auto_increment,
jobName varchar(40)
);

create table ProfileJobs(
ProfileId bigint,
JobId bigInt,
foreign key (ProfileId) references profiles(id) ,
foreign key (JobId) references Job(Job_Id),
JobExperience int
);
alter table addresses
add foreign key (state) references states(state_id);

alter table profiles
add foreign key (abilities_id) references abilities(code);

alter table job
add foreign key (ProfileId) references profilejobs(JobId);

alter table profiles
add foreign key (profileConf) references ProFileConf(profileConf_id);

alter table persons
add foreign key (gender) references gender(gender_id)
on delete no action;
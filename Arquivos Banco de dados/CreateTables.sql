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
constraint pk_profilesjob primary key (jobId, profileId),
foreign key (ProfileId) references profiles(id) ,
foreign key (JobId) references Job(Job_Id),
JobExperience int
);

drop table projects;
create table projects(
ProjectId 		bigInt primary key auto_increment,
Description		text,
ProjectTitle	varchar(20),
ProjectsImgId	bigInt,
foreign key (ProjectsImgId) references projectimages(imageId)
);

create table projectImages(
imageId			bigint primary key auto_increment,
ProjectId		bigint,
imgData			mediumblob
);

create table ProjectColaborates(
ProjectId 		bigInt,
ProfileId		bigint,
foreign key (ProjectId) references projects(ProjectId),
foreign key (ProfileId) references profiles(id)
);

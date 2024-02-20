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

alter table users
add foreign key(profileId) references profiles(id);
create table projects
(
    id          int primary key auto_increment,
    description varchar(100) not null
);

create table projects_steps
(
    id               int primary key auto_increment,
    description      varchar(100) not null,
    days_to_deadline int          not null,
    project_id       int          not null,
    foreign key (project_id) references projects (id)
);

alter table task_group
    add column projects_id int null;
alter table task_group
    add foreign key (projects_id) references projects (id);

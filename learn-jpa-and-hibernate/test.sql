create table course
(
    id     bigint       not null,
    name   varchar(255) not null,
    author varchar(255) not null,
    primary key (id)
);

insert into COURSE (id, name, author)
values (1, 'Learn AWS', 'in28minutes');

delete from course where id = 1;


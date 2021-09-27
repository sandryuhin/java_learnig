create table songs
(
    id serial not null
        constraint songs_pk
            primary key,
    name varchar not null,
    duration int not null
);
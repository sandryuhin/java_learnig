create table genres
(
    id serial not null
        constraint genres_pk
            primary key,
    name varchar not null
);
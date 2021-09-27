create table albums
(
    id serial not null
        constraint albums_pk
            primary key,
    name varchar not null,
    genre int
        constraint genre___fk
            references genres,
    singer int
        constraint singer___fk
            references singers
);
create table albums
(
    id serial not null
        constraint albums_pk
            primary key,
    name varchar not null,
    genre int
        constraint genre___fk
            references genres,
    songs int
        constraint songs___fk
            references songs
);
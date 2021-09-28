create table albums_filtred
(
    id serial not null
        constraint albums_filtred_pk
            primary key,
    name varchar not null,
    genre int
        constraint genre_filtred___fk
            references genres_filtred,
    singer int
        constraint singer_filtred___fk
            references singers_filtred
);
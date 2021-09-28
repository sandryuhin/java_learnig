create table genres_filtred
(
    id serial not null
        constraint genres_filtred_pk
            primary key,
    name varchar not null
);
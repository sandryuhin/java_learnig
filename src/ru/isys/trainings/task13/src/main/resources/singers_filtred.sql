create table singers_filtred
(
    id serial not null
        constraint singers_filtred_pk
            primary key,
    name varchar not null
);

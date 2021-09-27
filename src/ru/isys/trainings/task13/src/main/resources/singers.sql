create table singers
(
    id serial not null
        constraint singers_pk
            primary key,
    name varchar
);

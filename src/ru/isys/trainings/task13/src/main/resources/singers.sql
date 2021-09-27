create table singers
(
    column_1 serial not null
        constraint singers_pk
            primary key,
    name varchar
);

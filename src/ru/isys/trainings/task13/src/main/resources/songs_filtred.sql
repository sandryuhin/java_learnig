create table songs_filtred
(
    id serial not null
        constraint songs_filtred_pk
            primary key,
    name varchar not null,
    duration int not null,
    album int
        constraint genre_filtred___fk
            references albums_filtred
);
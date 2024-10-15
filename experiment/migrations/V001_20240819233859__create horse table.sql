CREATE TABLE IF NOT EXISTS horse(
    id serial primary key not null,
    horse_name varchar(255) not null,
    color varchar(255) not null,
    pattern varchar(255)
);

CREATE TABLE IF NOT EXISTS barn(
    id serial primary key not null,
    barn_name varchar(255) not null,
    owner int not null,
    size int not null,
    feed_room boolean,
    tack_room boolean,
    shower_stall boolean,
    indoor_arena boolean,
    outdoor_arena boolean
);

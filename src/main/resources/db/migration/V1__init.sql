create table owners (
  owner_id serial primary key,
  "name" varchar not null
);

create table pets (
  pet_id serial primary key,
  age integer not null,
  "name" varchar not null,
  owner_id serial references owners
);

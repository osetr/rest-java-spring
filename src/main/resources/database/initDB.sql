CREATE TABLE client(
                       id INT GENERATED ALWAYS AS IDENTITY,
                       name VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       age int,
                       height int,
                       weight int,
                       PRIMARY KEY(id)
);

CREATE TABLE dish(
                     id INT GENERATED ALWAYS AS IDENTITY,
                     name VARCHAR(255) NOT NULL,
                     proteins int,
                     fats int,
                     carbohydrates int,
                     PRIMARY KEY(id)
);

create table event (
                       id INT GENERATED ALWAYS AS IDENTITY,
                       client_id int,
                       dish_id int,
                       CONSTRAINT client_id
                           FOREIGN KEY(client_id)
                               REFERENCES client(id)
                               ON DELETE CASCADE,
                       CONSTRAINT dish_id
                           FOREIGN KEY(dish_id)
                               REFERENCES dish(id)
                               ON DELETE CASCADE,
                       PRIMARY KEY(id)
);
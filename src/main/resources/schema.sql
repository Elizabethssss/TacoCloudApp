# create table if not exists Ingredient (
#     id varchar(4) not null,
#     name varchar(25) not null,
#     type varchar(10) not null
# );
#
# create table if not exists Taco (
#     id bigint auto_increment primary key,
#     name varchar(50) not null,
#     created_at timestamp not null
# );
#
# create table if not exists Taco_Ingredients (
#     taco bigint not null,
#     ingredient varchar(4) not null
# );
#
# alter table Taco_Ingredients
#     add foreign key (taco_id) references Taco(id);
# alter table Taco_Ingredients
#     add foreign key (ingredient_id) references Ingredient(id);
#
# create table if not exists Taco_Order (
#     id bigint auto_increment primary key,
#     name varchar(50) not null,
#     street varchar(50) not null,
#     city varchar(50) not null,
#     state varchar(2) not null,
#     zip varchar(10) not null,
#     ccNumber varchar(16) not null,
#     ccExpiration varchar(5) not null,
#     ccCVV varchar(3) not null,
#     placed_at timestamp not null
# );
#
# create table if not exists Taco_Order_Tacos (
#     tacoOrder bigint not null,
#     taco bigint not null
# );
#
# alter table Taco_Order_Tacos
#     add foreign key (tacoOrder_id) references Taco_Order(id);
# alter table Taco_Order_Tacos
#     add foreign key (taco_id) references Taco(id);
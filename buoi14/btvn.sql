create database QL_Production;

use QL_Production;

create table Production(
                           id int primary key auto_increment,
                           ten nvarchar(50),
                           mo_ta text,
                           gia decimal(10,2),
                           tong_so_luong int,
                           category_id int
);
create table Production_detail(
                                  id int auto_increment primary key ,
                                  production_id int,
                                  so_luong int
);
create table branch(
                       id int primary key auto_increment,
                       ten nvarchar(200),
                       dia_chi varchar(255),
                       mail varchar(50),
                       phone varchar(100)
);
create table social(
                       id int primary key auto_increment,
                       link varchar(255),
                       ten nvarchar(255),
                       company_id int
);
create table company_info(
                             id int primary key auto_increment,
                             ten nvarchar(255),
                             dia_chi nvarchar(255),
                             phone varchar(10)
);
create table category(
                         id int primary key auto_increment,
                         ten nvarchar(255)
);
create table image(
                      id int,
                      path varchar(255),
                      extention varchar(20)
);
create table size(
                     id int primary key auto_increment,
                     ten nvarchar(255),
                     ma varchar(50),
                     type varchar(50)
);
create table color(
                      id int primary key auto_increment,
                      ten nvarchar(255),
                      ma varchar(50)
);
CREATE TABLE production_detail_color (
                                         id INT AUTO_INCREMENT PRIMARY KEY,
                                         detail_id INT,
                                         color_id INT
);
CREATE TABLE production_detail_size (
                                        id INT AUTO_INCREMENT PRIMARY KEY,
                                        detail_id INT,
                                        size_id INT
);
CREATE TABLE image_production_detail (
                                         id INT AUTO_INCREMENT PRIMARY KEY,
                                         image_id INT,
                                         detail_id INT
);
alter table social add foreign key (company_id) references company_info(id);
alter table Production add foreign key (category_id) references category(id);
alter table Production_detail add foreign key (production_id) references Production(id);
alter table production_detail_color add foreign key (detail_id) references Production_detail(id);
alter table production_detail_color add foreign key (color_id) references color(id);
alter table production_detail_size add foreign key (detail_id) references Production_detail(id);
alter table production_detail_size add foreign key (size_id) references size(id);
alter table image_production_detail add foreign key (image_id) references image(id);
alter table image_production_detail add foreign key (detail_id) references Production_detail(id);










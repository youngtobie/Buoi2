create database QL_SINHVIEN;
use QL_SINHVIEN;
create table sinh_vien(
                          id int primary key auto_increment,
                          ho_ten nvarchar(50) not null ,
                          ngay_sinh date,
                          gioi_tinh varchar(10),
                          dia_chi nvarchar(255),
                          email varchar(50) unique ,
                          diem_trung_binh decimal  -- làm tròn đến chữ số thập phân thứ 2

);

create table mon_hoc(
                        id int primary key auto_increment,
                        ten_mon nvarchar(255),
                        so_tin_chi integer
);
create table diem_thi(
                         id int primary key auto_increment,
                         id_sinh_vien int,
                         id_mon int,
                         diem decimal
);

alter table diem_thi
    add foreign key (id_sinh_vien) references sinh_vien(id);
alter table diem_thi
    add foreign key (id_mon) references mon_hoc(id);
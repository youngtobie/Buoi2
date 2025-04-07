create database QL_SINHVIEN;

use QL_SINHVIEN;

create table SinhVien(
                         id int primary key ,
                         ho_ten varchar(50) not null ,
                         ngay_sinh date,
                         gioi_tinh varchar(10),
                         dia_chi varchar(50),
                         email varchar(60) unique ,
                         diem_trung_binh decimal(4,2)
);

create table MonHoc(
                       id_mon int primary key ,
                       ten_mon varchar(50),
                       so_tin_chi int
);
create table DiemThi(
                        id_diem int primary key auto_increment,
                        id_sinhvien int,
                        id_mon int ,
                        diem decimal
);

alter table DiemThi
   add foreign key (id_sinhvien) references SinhVien(id),
   add foreign key (id_mon) references MonHoc(id_mon);
use QL_SINHVIEN;
insert into
SinhVien
    (id,ho_ten,ngay_sinh,gioi_tinh,dia_chi,email,diem_trung_binh)
values
    (1,'Nguyễn Văn A','2003-08-18','Nam','Thái Bình','ntg@gmail.com',7.8),
    (2,'Trương Thị Hồng Thắm','2003-10-06','Nữ','Tây Sơn','ttht@gmail.com',8.9),
    (3,'Nguyễn Văn A','2003-11-04','Nam','Hà Nam','tha@gmail.com',8.8),
    (4,'Nguyễn Văn A','2003-8-30','Nam','Tiền Hải','pdt@yahoo.com',9.8),
    (5,'Nguyễn Văn A','2003-8-31','Nam','Hà Nội','tqd@gamil.com',5.1);

insert into MonHoc
(id_mon, ten_mon, so_tin_chi)
values
    (1,'Toán Giải Tích','4'),
    (2,'Lịch Sử Đảng','2'),
    (3,'Vật Lý Đại Cương','4');
insert into DiemThi
(id_diem,id_sinhvien, id_mon, diem)
values
    (1,1,1,7.9),
    (2,3,2,8.8),
    (3,5,1,7.8),
    (4,4,3,5.5);

update SinhVien
set
    diem_trung_binh = 6.1
where
    id = 3;
update DiemThi
set
    diem = 9
where id_sinhvien = 3 and id_mon = 2;
select * from SinhVien;
select * from DiemThi;
select so_tin_chi from MonHoc;
-- Hiển thị tên sinh viên, môn học và điểm thi của sinh viên đó từ bảng SinhVien, MonHoc, DiemThi bằng cách sử dụng câu lệnh JOIN.
select * from SinhVien where diem_trung_binh > 8;
-- Liệt kê các môn học mà sinh viên có điểm thi dưới 5.0

-- Đếm số lượng sinh viên có điểm thi môn học trên 6.0.
select * from SinhVien where 7 < diem_trung_binh < 8.5 and gioi_tinh = 'Nam';
select *from SinhVien where email like '%gmail.com' or email like '%yahoo.com';

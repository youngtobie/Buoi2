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
create table laptop(
                       id int primary key auto_increment,
                       ten varchar(100),
                       ngay_cap date,
                       id_sinh_vien int
);

alter table diem_thi
    add foreign key (id_sinh_vien) references sinh_vien(id);
alter table diem_thi
    add foreign key (id_mon) references mon_hoc(id);
alter table laptop
    add foreign key (id_sinh_vien) references sinh_vien(id);

INSERT INTO ql_sinhvien.sinh_vien (id, ho_ten, ngay_sinh, gioi_tinh, dia_chi, email, diem_trung_binh) VALUES (1, 'Nguyễn Văn A', '1998-01-02', 'Male', 'Hà Nội', 'a@gmail.com', 7);
INSERT INTO ql_sinhvien.sinh_vien (id, ho_ten, ngay_sinh, gioi_tinh, dia_chi, email, diem_trung_binh) VALUES (2, 'Lê Anh B', '1999-01-02', 'Female', 'Thanh Hóa', 'b@gmail.com', 8);
INSERT INTO ql_sinhvien.sinh_vien (id, ho_ten, ngay_sinh, gioi_tinh, dia_chi, email, diem_trung_binh) VALUES (3, 'Hồ Văn C', '1994-01-02', 'Male', 'Nghệ An', 'c@gmail.com', 9);
INSERT INTO ql_sinhvien.sinh_vien (id, ho_ten, ngay_sinh, gioi_tinh, dia_chi, email, diem_trung_binh) VALUES (4, 'Vương Văn D', '1995-01-02', 'Female', 'Bình Định', 'd@gmail.com', 8);
INSERT INTO ql_sinhvien.sinh_vien (id, ho_ten, ngay_sinh, gioi_tinh, dia_chi, email, diem_trung_binh) VALUES (5, 'Nguyễn Thị R', '1998-03-02', 'Female', 'Yên Bái', 'e@gmail.com', 6);


INSERT INTO ql_sinhvien.mon_hoc (id, ten_mon, so_tin_chi) VALUES (1, 'Cấu trúc dữ liệu ', 2);
INSERT INTO ql_sinhvien.mon_hoc (id, ten_mon, so_tin_chi) VALUES (2, 'Lập trình Java', 2);
INSERT INTO ql_sinhvien.mon_hoc (id, ten_mon, so_tin_chi) VALUES (3, 'Thể dục', 1);

INSERT INTO ql_sinhvien.diem_thi (id, id_sinh_vien, id_mon, diem) VALUES (1, 1, 1, 5);
INSERT INTO ql_sinhvien.diem_thi (id, id_sinh_vien, id_mon, diem) VALUES (2, 2, 2, 6);
INSERT INTO ql_sinhvien.diem_thi (id, id_sinh_vien, id_mon, diem) VALUES (3, 3, 3, 7);
INSERT INTO ql_sinhvien.diem_thi (id, id_sinh_vien, id_mon, diem) VALUES (4, 3, 1, 8);
INSERT INTO ql_sinhvien.diem_thi (id, id_sinh_vien, id_mon, diem) VALUES (5, 2, 2, 9);
INSERT INTO ql_sinhvien.diem_thi (id, id_sinh_vien, id_mon, diem) VALUES (6, 1, 3, 10);

INSERT INTO ql_sinhvien.laptop (id, ten, ngay_cap, id_sinh_vien) VALUES (1, 'DELL001', '2025-04-08', 1);
INSERT INTO ql_sinhvien.laptop (id, ten, ngay_cap, id_sinh_vien) VALUES (2, 'DELL002', '2025-04-08', 1);
INSERT INTO ql_sinhvien.laptop (id, ten, ngay_cap, id_sinh_vien) VALUES (3, 'Mac001', '2025-04-08', 2);
INSERT INTO ql_sinhvien.laptop (id, ten, ngay_cap, id_sinh_vien) VALUES (4, 'Mac002', '2025-04-08', 3);
INSERT INTO ql_sinhvien.laptop (id, ten, ngay_cap, id_sinh_vien) VALUES (5, 'ThinkPad001', '2025-04-08', 3);


-- 4.sử dụng câu lệnh update

-- 5. truy vấn
-- 5.1 Liệt kê tất cả sinh viên và thông tin của họ từ bảng SinhVien.
select * from sinh_vien;
-- 5.2 Liệt kê tất cả môn học với số tín chỉ từ bảng MonHoc.
select * from mon_hoc;
-- 5.3 Hiển thị tên sinh viên, môn học và điểm thi của sinh viên đó từ bảng SinhVien, MonHoc, DiemThi bằng cách sử dụng câu lệnh JOIN.
-- inner join vd:
select * from sinh_vien
--  lấy những bản ghi có id vừa tồn tại bảng sinh viên vừa tồn tại ở column id_sinh_vienở bảng điểm thi
                  inner join diem_thi on sinh_vien.id = diem_thi.id_sinh_vien ;

-- chỉ ấy ra các sinh viên có laptop
-- jion không nhất thiê thông qua kháo ngoại , khóa ngoại bản chất chỉ để đảm báo tính toàn vẹn giữ liệu giưữa các table quan hệ với nhau
select * from sinh_vien inner join laptop on sinh_vien.id = laptop.id_sinh_vien;

-- hiển thị tên sinh viên , tên môn học , điêm thi môn học của sinh viên

select ho_ten,mon_hoc.ten_mon,diem_thi.diem from sinh_vien
                                                     inner join diem_thi on diem_thi.id_sinh_vien = sinh_vien.id
                                                     inner join mon_hoc on mon_hoc.id = diem_thi.id_mon;

-- 5.3 tìm tất cả sinh viên có điểm trung bình ớn hơn 8.0

select * from sinh_vien where diem_trung_binh > 8;

-- 5.3 liệt kê các môn học mà sinh viên có điểm thidudois 5.0

select * from mon_hoc
                  inner join diem_thi on mon_hoc.id = diem_thi.id_mon
where diem_thi.diem < 7;

-- 5.4 đếm số lượng sinh vin có điểm thi trên 6.

select count(id_sinh_vien) as so_luong_sinh_vien from diem_thi where  diem > 6;

-- 5.6 tiìm tâất cả sinh viên códidemr trung bình từ 7.0 đến 8.5 và giới tính nam

select * from sinh_vien where diem_trung_binh >= 7 and diem_trung_binh <= 8.5 and sinh_vien.gioi_tinh = 'Male';

-- liệt kê tất cả sinh viên có email chư gmail.com or yahoo.com

select * from sinh_vien where sinh_vien.email like '%gmail.com%'or sinh_vien.email like '%yahoo.com%';

select diem_thi.id_sinh_vien from diem_thi where diem_thi.diem < 5;

-- 6.3 thêm distinct loại bỏ thằng trùng nhau
select sinh_vien.ho_ten,diem_thi.diem,sinh_vien.diem_trung_binh from sinh_vien inner join diem_thi on sinh_vien.id = diem_thi.id_sinh_vien
where diem_thi.diem < 5 and sinh_vien.diem_trung_binh > 6.5;

select distinct sinh_vien.ho_ten from sinh_vien inner join diem_thi on sinh_vien.id = diem_thi.id_sinh_vien
where diem_thi.diem < 5 and sinh_vien.diem_trung_binh > 6.5;

-- đếm s lương sinh viên có điểm thi mn học lớn hơn 6.0, nhóm theo môn học
select count(diem_thi.id_sinh_vien), mon_hoc.ten_mon from mon_hoc inner join diem_thi on diem_thi.id_mon=mon_hoc.id
where diem_thi.diem > 6 group by mon_hoc.ten_mon;

select count(diem_thi.id_sinh_vien),mon_hoc.ten_mon from mon_hoc inner join diem_thi on diem_thi.id_mon = mon_hoc.id
where diem_thi.diem < 5 group by mon_hoc.ten_mon;

-- left join

/*

- lấy tất cả dữ liệu của bảng phía bên trái, và nững dữ liệu
thỏa mãn sau on của bảng phía bên phải
- bảng left : là table phía trước left join
- table right: là table sau left join
 */

-- vd : lấy tất cả sinh viên và thông tin laptop của sinh vien đấy, lấy tất cả các sinh viên đó
-- lấy tất cả sinh viên k có laptop
select sinh_vien.ho_ten,laptop.ten from sinh_vien left join laptop
                                                            on sinh_vien.id = laptop.id;

-- right join
/*
 - lấy tất cả các dữ liệu ở bảng phía bên phải và các dữ liệu ở bảng phi bên traí
 khi thỏa mãn điều kiện on
 - bảng right : là table phía trước right join
- table right: là table sau right join
 */

-- vd lấy taất cả các thông tin sinh viên và laptop ,
-- chỉ lấy lấy sinh viên có laptop, và các laptop không thuc về sinh viên nào

select sinh_vien.ho_ten,laptop.ten from sinh_vien right join laptop on sinh_vien.id = laptop.id_sinh_vien;

-- cross join

/*
 lấy hết dữ liệu của cả 2 table thường sd để get dữ liệu của 2 table
 nếu c nm dòng tại table left và n dòng tại table right
 => tổng số dòng cross join = m*n
 */

select * from sinh_vien cross join laptop ;

select * from laptop inner join sinh_vien
                                on laptop.id_sinh_vien = sinh_vien.id
where sinh_vien.ho_ten = 'Nguyễn Văn A';

-- sub query
/*
 câu quersexnhor được lồng trong query to, gi trị cảu sub query sẽ đưuo root query
 dùng làm bản tạm hoặc 1 giá trị ể so sánh

 */
select * from laptop where laptop.id_sinh_vien = (select sinh_vien.id from sinh_vien where ho_ten = 'Nguyễn Văn A');
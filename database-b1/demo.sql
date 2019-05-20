drop database if exists QLYTHUVIEN;
create database QLYTHUVIEN;
use QLYTHUVIEN;

drop table if exists SACH;
create table SACH (
	masach int not null primary key auto_increment,
	ten nvarchar(500),
	tacgia nvarchar(500),
	nxb nvarchar(500),
	soluong int
);

drop table if exists DOCGIA;
create table DOCGIA (
	sothe int not null primary key auto_increment,
	ten nvarchar(500) not null,
	khoa nvarchar(500) not null,
	khoahoc nvarchar(500),
	thoihanthe datetime
);

drop table if exists PHIEUMUON;
create table PHIEUMUON (
	masach int not null,
	sothe int not null,
	ngaymuon datetime,
	ngaytra datetime,
	ghichu nvarchar(1000),
	primary key (masach, sothe),
	foreign key (masach) references SACH(masach),
	foreign key (sothe) references DOCGIA(sothe)
);

insert into SACH(ten, tacgia, nxb, soluong) values ('Toan', 'Nguyen Dinh Tri', 'nxb giao duc', 10);
insert into SACH(ten, tacgia, nxb, soluong) values ('Tin', 'Vu Van Anh', 'nxb khoa hoc', 20);
insert into SACH(ten, tacgia, nxb, soluong) values ('Anh', 'Tran Bao Binh', 'nxb giao duc', 30);
insert into SACH(ten, tacgia, nxb, soluong) values ('Van hoc', 'Ngo van Can', 'nxb khoa hoc', 20);
insert into SACH(ten, tacgia, nxb, soluong) values ('Tam ly hoc', 'Hoang Van Quan', 'nxb giao duc', 20);


insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values 
('Nguyen Van An', 'ATTT', 'AT13', STR_TO_DATE('10/08/2019', '%d/%m/%Y'));
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values 
('Nguyen Thi Bich', 'Dien tu', 'DT01', STR_TO_DATE('30/08/2020', '%d/%m/%Y'));
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values 
('Hoang Van Hieu', 'CNTT', 'CT01', STR_TO_DATE('30/08/2021', '%d/%m/%Y'));
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values 
('Ngo Van Minh', 'CNTT', 'CT02', STR_TO_DATE('30/08/2022', '%d/%m/%Y'));
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values 
('Nguyen Van Binh', 'ATTT', 'AT14', STR_TO_DATE('30/08/2019', '%d/%m/%Y'));


insert into PHIEUMUON(masach, sothe, ngaymuon,ngaytra) values
(1, 5, STR_TO_DATE('01/01/2018', '%d/%m/%Y'),STR_TO_DATE('01/05/2018', '%d/%m/%Y'));
insert into PHIEUMUON(masach, sothe, ngaymuon,ngaytra) values
(2, 4, STR_TO_DATE('12/02/2018', '%d/%m/%Y'),STR_TO_DATE('12/08/2018', '%d/%m/%Y'));
insert into PHIEUMUON(masach, sothe, ngaymuon,ngaytra) values
(3, 3, STR_TO_DATE('01/02/2018', '%d/%m/%Y'),STR_TO_DATE('01/08/2018', '%d/%m/%Y'));
insert into PHIEUMUON(masach, sothe, ngaymuon,ngaytra) values
(4, 2, STR_TO_DATE('14/01/2018', '%d/%m/%Y'),STR_TO_DATE('14/06/2018', '%d/%m/%Y'));


# Hiển thị tên , khoa của các độc giả và sắp xếp theo khoa
select sothe, ten, khoa from DOCGIA order by khoa asc;


#Tìm những đọc giả mượn sách 'Toan' vào ngày 01/01/2018
select dg.ten from PHIEUMUON as pm
join DOCGIA as dg on pm.sothe = dg.sothe
join SACH as s on pm.masach = s.masach
where s.ten = 'Toan' and pm.ngaymuon = STR_TO_DATE('01/01/2018', '%d/%m/%Y');


# Hiên thị tên, số thẻ, tên sách tất cả các độc giả mượn sách trong tháng 1/2018
select dg.ten, pm.sothe, s.ten from PHIEUMUON as pm
join DOCGIA as dg on pm.sothe = dg.sothe
join SACH as s on pm.masach = s.masach
where pm.ngaymuon between STR_TO_DATE('01/01/2018', '%d/%m/%Y') and STR_TO_DATE('31/12/2018', '%d/%m/%Y');


# Danh sách các sách không ai mượn
select s.ten from SACH as s
where s.masach not in (select distinct masach from PHIEUMUON);


# Cho biết đọc giả tên 'Hieu' mượn sách bao nhiêu lần
select count(*) as 'So lan' from PHIEUMUON as pm
join DOCGIA as dg on pm.sothe = dg.sothe
join SACH as s on pm.masach = s.masach
where dg.ten = 'Hieu';

select d.* from PHIEUMUON p
join DOCGIA d on d.sothe = p.sothe
where p.ngaytra is null
sachphieumuon
select s.ten from qlthuvien.sach as s
where s.masach not in (select distinct masach from qlthuvien.phieumuon);
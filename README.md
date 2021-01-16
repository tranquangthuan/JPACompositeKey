# JPACompositeKey
Demo Compositekey Bằng @IdClass
Table:
 SinhVien(sinhvien_id, name)
 KhocHoc(khoahoc_id,name)
 SinhVienKhoaHoc(sinhvien_id, khoahoc_id, rating) 
	-- Primary key (sinhvien_id, khoahoc_id)
	-- foreign key sinhvien_id refer đến SinhVien(sinhvien_id)
	-- foreign key khoahoc_id refer đến KhocHoc(khoahoc_id)	
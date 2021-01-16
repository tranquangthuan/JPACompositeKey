package com.thuan.java.springboot.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(SinhVienKey.class)
public class SinhVienKhoaHoc {
	@Id
	@Column(name = "khoa_hoc_id")
	private Long khoaHocId;

	@Id
	@Column(name = "sinh_vien_id")
	private Long sinhVienId;

	/** sinhVien. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sinh_vien_id", referencedColumnName = "sinhvien_id", insertable = false, updatable = false)
	private SinhVien sinhVien;

	/** khoaHoc. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "khoa_hoc_id", referencedColumnName = "khoa_hoc_id", insertable = false, updatable = false)
	private KhoaHoc khoaHoc;
}

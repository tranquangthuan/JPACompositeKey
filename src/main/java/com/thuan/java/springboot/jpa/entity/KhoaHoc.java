package com.thuan.java.springboot.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class KhoaHoc {
	@Id
	@Column(name = "khoa_hoc_id")
	private Long id;

	private String name;

	/** screenFunction. */
	@OneToMany(mappedBy = "khoaHoc", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SinhVienKhoaHoc> sinhVienKhoaHocs;
}

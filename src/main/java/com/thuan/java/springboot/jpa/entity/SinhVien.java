package com.thuan.java.springboot.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SinhVien {

	@Id
	@Column(name = "sinhvien_id")
	private Long id;

	private String name;

	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String name) {
		super();
		this.name = name;
	}

	/** screenFunction. */
	@OneToMany(mappedBy = "sinhVien", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<SinhVienKhoaHoc> sinhVienKhoaHocs;

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", name=" + name + ", sinhVienKhoaHocs=" + sinhVienKhoaHocs + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SinhVienKhoaHoc> getSinhVienKhoaHocs() {
		return sinhVienKhoaHocs;
	}

	public void setSinhVienKhoaHocs(List<SinhVienKhoaHoc> sinhVienKhoaHocs) {
		this.sinhVienKhoaHocs = sinhVienKhoaHocs;
	}

}

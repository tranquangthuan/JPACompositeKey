package com.thuan.java.springboot.jpa.entity;

import java.io.Serializable;

public class SinhVienKey implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private Long sinhVienId;

	private Long khoaHocId;

	public SinhVienKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVienKey(Long sinhVienId, Long khoaHocId) {
		super();
		this.sinhVienId = sinhVienId;
		this.khoaHocId = khoaHocId;
	}

	public Long getSinhVienId() {
		return sinhVienId;
	}

	public void setSinhVienId(Long sinhVienId) {
		this.sinhVienId = sinhVienId;
	}

	public Long getKhoaHocId() {
		return khoaHocId;
	}

	public void setKhoaHocId(Long khoaHocId) {
		this.khoaHocId = khoaHocId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((khoaHocId == null) ? 0 : khoaHocId.hashCode());
		result = prime * result + ((sinhVienId == null) ? 0 : sinhVienId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVienKey other = (SinhVienKey) obj;
		if (khoaHocId == null) {
			if (other.khoaHocId != null)
				return false;
		} else if (!khoaHocId.equals(other.khoaHocId))
			return false;
		if (sinhVienId == null) {
			if (other.sinhVienId != null)
				return false;
		} else if (!sinhVienId.equals(other.sinhVienId))
			return false;
		return true;
	}

}

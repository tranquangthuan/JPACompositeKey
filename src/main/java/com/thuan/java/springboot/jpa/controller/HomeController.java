package com.thuan.java.springboot.jpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.thuan.java.springboot.jpa.entity.SinhVien;
import com.thuan.java.springboot.jpa.repository.SinhVienRepository;

@RestController
public class HomeController {

	@Autowired
	private SinhVienRepository sinhVienRepository;

	@GetMapping(value = "/index")
	public String home() {
		return "index page";

	}

	@GetMapping(value = "/sv/{id}")
	public String findSV(@PathVariable Long id) {
		Optional<SinhVien> sinhVien = sinhVienRepository.findById(id);
		if (sinhVien.isPresent()) {
			SinhVien obj = sinhVien.get();
			obj.getSinhVienKhoaHocs();
			return obj.toString();
		}
		return "not found";

	}

}

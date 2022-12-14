package com.idat.TuristaMicroService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.TuristaMicroService.dto.TuristaDTO;
import com.idat.TuristaMicroService.service.TuristaService;
@Controller
@RequestMapping("/api/turista/v1")
public class TuristaController {
	@Autowired
	private TuristaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<TuristaDTO> listar(){
		return service.listar();
	}
}

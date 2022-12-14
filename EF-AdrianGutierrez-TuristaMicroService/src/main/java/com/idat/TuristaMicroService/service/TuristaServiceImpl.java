package com.idat.TuristaMicroService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.TuristaMicroService.dto.TuristaDTO;
import com.idat.TuristaMicroService.model.Turista;
import com.idat.TuristaMicroService.repository.TuristaRepository;
@Service
public class TuristaServiceImpl implements TuristaService{
	@Autowired
	private TuristaRepository repository;
	
	@Override
	public List<TuristaDTO> listar() {
		List<TuristaDTO> listado = new ArrayList<>();
		TuristaDTO dto = null;
				
		for (Turista turista : repository.findAll()) {
			dto = new TuristaDTO();
			dto.setCod(turista.getIdTurista());
			dto.setNom(turista.getNombreTurista());
			dto.setCel(turista.getNroCelular());
			dto.setDir(turista.getDireccion());
			
			
			listado.add(dto);
		}
		
		return listado;
	}
}

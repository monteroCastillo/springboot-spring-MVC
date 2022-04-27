package com.example.empleos.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.empleos.model.Categoria;
import com.example.empleos.repository.CategoriasRepository;
import com.example.empleos.service.ICategoriasService;

@Service
@Primary
public class CategoriaServiceJpa implements ICategoriasService {

	@Autowired
	private CategoriasRepository categoriasRepo;
	
	@Override
	public List<Categoria> buscarTodas() {
		// TODO Auto-generated method stub
		return categoriasRepo.findAll();
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		Optional<Categoria> optional= categoriasRepo.findById(idCategoria);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Categoria categoria) {
		categoriasRepo.save(categoria);

	}

	
	public void eliminar(Integer idCategoria) {
		
		categoriasRepo.deleteById(idCategoria);
		
	}

}

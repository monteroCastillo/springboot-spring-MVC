package com.example.empleos.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.empleos.model.Vacante;

@Service
public class VacantesServiceImpl implements IVacantesService{

	private List<Vacante> lista = null;
	
	public VacantesServiceImpl() {			
			
		SimpleDateFormat sdf = new SimpleDateFormat("ss-MM-yyyy");
	    lista = new LinkedList<Vacante>();
		
		try {
			//Creamos la oferta de trabajo 1.
			Vacante vacante1 = new Vacante();
			vacante1.setId(1);
			vacante1.setNombre("Ingeniero Civil");//Titulo de la vacante
			vacante1.setDescripcion("Solicitamos Ing. Civil para diseñar puente peatonal.");
			vacante1.setFecha(sdf.parse("06-04-2022"));
			vacante1.setSalario(14000.0);
			vacante1.setDestacado(1);
			vacante1.setImagen("empresa1.png");
			
			//Creamos la oferta de trabajo 2.
			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Contador Publico");//Titulo de la vacante
			vacante2.setDescripcion("Empresa importate solicita contador con 5 años de experiencia titulado");
			vacante2.setFecha(sdf.parse("05-04-2022"));
			vacante2.setSalario(12000.0);
			vacante2.setDestacado(0);
			vacante2.setImagen("empresa2.png");
			
			//Creamos la oferta de trabajo 3.
			Vacante vacante3 = new Vacante();
			vacante3.setId(3);
			vacante3.setNombre("Ingeniero Electrico");//Titulo de la vacante
			vacante3.setDescripcion("Empresa Internacional solicita Ingeniero Mecánico para mantenimiento en instalacion eléctrica");
			vacante3.setFecha(sdf.parse("04-04-2022"));
			vacante3.setSalario(10500.0);
			vacante3.setDestacado(0);
			
			//Creamos la oferta de trabajo 4.
			Vacante vacante4 = new Vacante();
			vacante4.setId(4);
			vacante4.setNombre("Diseñador Gráfico");//Titulo de la vacante
			vacante4.setDescripcion("Solicitamos diseñador Gráfico titulado para diseñar publicidad de la empresa");
			vacante4.setFecha(sdf.parse("03-04-2022"));
			vacante4.setSalario(7500.0);
			vacante4.setDestacado(1);
			vacante4.setImagen("empresa3.png");
			
			/**
			 * Agregamos los 4 objetos de tipo Vacante a la lista ...
			 */
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);
		}catch(ParseException e) {
			System.out.println("Error:" + e.getMessage());
			
		}		
	}
	
	
	public List<Vacante> buscarTodas() {			
		
		return lista;
	}
	
	public Vacante buscarPorId(Integer idVacante) {
		
		for(Vacante v : lista) {
			if(v.getId()==idVacante) {
				return v;
			}
		}
		return null;
	}

}
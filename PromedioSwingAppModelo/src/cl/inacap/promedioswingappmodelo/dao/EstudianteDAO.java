package cl.inacap.promedioswingappmodelo.dao;

import java.util.List;
import cl.inacap.promedioswingappmodelo.dto.Estudiante;

import java.util.ArrayList;

public class EstudianteDAO {
	public static List<Estudiante> estudiantes = new ArrayList<>();
	
	public void save(Estudiante e) {
		estudiantes.add(e);
	}
	
	public List<Estudiante> getAll() {
		return estudiantes;
	}
	
	public List<Estudiante> filtrarEstudiante(String filtro) {
		List<Estudiante> estudiantesFiltrados = new ArrayList<>();
		for (Estudiante e : estudiantes) {
			if (filtro.equals("<4.0") && e.getPromedio() < 4.0) {
				estudiantesFiltrados.add(e);
			}
			if (filtro.equals("=4.0") && e.getPromedio() == 4.0) {
				estudiantesFiltrados.add(e);
			}
			if (filtro.equals(">4.0") && e.getPromedio() > 4.0) {
				estudiantesFiltrados.add(e);
			}
		}
		return estudiantesFiltrados;
	}
	
	public void update(Estudiante e) {
	    for (Estudiante estudiante : estudiantes) {
	        if (estudiante.getId() == e.getId()) {
	        	estudiante = e;
	            break;
	        }
	    }
	}

	public void delete(Estudiante e) {
		estudiantes.remove(e);
	}
}

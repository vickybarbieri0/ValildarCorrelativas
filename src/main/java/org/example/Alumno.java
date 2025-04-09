package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Alumno {
	@Getter
	@Setter
	private String nombre;
	@Getter
	@Setter
	private List<Materia> materiasAprobadas;

	public Alumno(String nombre, List<Materia> materiasAprobadas) {
		this.nombre = nombre;
		this.materiasAprobadas = materiasAprobadas;
	}

}

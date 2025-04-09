package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Inscripcion {
	@Setter
	@Getter
	private List<Materia> materias;
	@Setter
	@Getter
	private Alumno alumno;

	public Inscripcion(List<Materia> materias, Alumno alumno) {
		this.materias = materias;
		this.alumno = alumno;
	}

	public boolean puedeMateria (Materia materia) {
		return alumno.getMateriasAprobadas().containsAll(materia.getCorrelactivas());
	}

	public boolean aprobada(Alumno alumno) {
		return materias.stream().allMatch(materia -> puedeMateria(materia));
	}
}

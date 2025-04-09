package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

	@Test
	@DisplayName("Puede hacer la materia con las materias aprobadas")
	void testPuedeMateria_conCorrelativasAprobadas() {
		Materia algoritmos = new Materia("Algoritmos", Collections.emptyList());
		Materia paradigmas = new Materia("Paradigmas", Arrays.asList(algoritmos));

		Alumno alumno = new Alumno("Juan", Arrays.asList(algoritmos));
		Inscripcion inscripcion = new Inscripcion(Arrays.asList(paradigmas), alumno);

		assertTrue(inscripcion.puedeMateria(paradigmas));
	}

	@Test
	@DisplayName("No puede materia sin correlactivas aprobadas")
	void testPuedeMateria_sinCorrelativasAprobadas() {
		Materia algoritmos = new Materia("Algoritmos", Collections.emptyList());
		Materia paradigmas = new Materia("Paradigmas", Arrays.asList(algoritmos));

		Alumno alumno = new Alumno("Lucía", Collections.emptyList());
		Inscripcion inscripcion = new Inscripcion(Arrays.asList(paradigmas), alumno);

		assertFalse(inscripcion.puedeMateria(paradigmas));
	}

}
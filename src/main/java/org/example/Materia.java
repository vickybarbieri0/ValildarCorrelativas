package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class Materia {
	@Getter
	@Setter
	private static String nombre;
	@Getter
	@Setter
	private static List<Materia> correlactivas;

public Materia(String nombre, List<Materia> correlactivas) {
	Materia.nombre = nombre;
	Materia.correlactivas = correlactivas;
}
}

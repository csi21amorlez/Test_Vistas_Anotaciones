package ejemploWebClase.entidades;

import java.util.ArrayList;

public class AlumnoRepo {

	public static ArrayList<Alumno> listAlumnos() {
		
		ArrayList<Alumno> listAlumnos = new ArrayList<>();
		
		listAlumnos.add(new Alumno(1, "Antonio", "Gomez", "CSI-2", "Decepcion 3"));
		listAlumnos.add(new Alumno(2, "Manolo", "Lopez", "CSI-2", "No info"));
		listAlumnos.add(new Alumno(3, "Fabio", "Gonzalez", "CSI-2", "Cabezas Rubias 5"));
		listAlumnos.add(new Alumno(4, "Gustavo", "Fling", "CSI-2", "Tuco 45"));
		listAlumnos.add(new Alumno(5, "Walter", "White", "CSI-2", "Arroyo negro lane"));
		listAlumnos.add(new Alumno(6, "Jesse", "Pinkman", "CSI-2", "Rehab"));
		listAlumnos.add(new Alumno(7, "Hank", "Schrader", "CSI-2", "Polisia"));

		return listAlumnos;
	}

}

package ejemploWebClase.web.Controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ejemploWebClase.entidades.Alumno;
import ejemploWebClase.entidades.AlumnoRepo;


@Controller
public class ControllerInsert {
	
	protected ArrayList<Alumno> repoAlumno = AlumnoRepo.listAlumnos();

	@RequestMapping(name="ControladorInsertAlumno",method = RequestMethod.POST)
	public void insertarAlumno(String nombre, String apellidos, String curso, String direccion) {
		

		Alumno a = new Alumno();
		
		a.setApellidos(apellidos);
		a.setCurso(curso);
		a.setDireccion(direccion);
		a.setNombre(nombre);
		a.setId(repoAlumno.get(repoAlumno.size() + 1).getId());
		
		/*
		a.setId(repoAlumno.get(repoAlumno.size() + 1).getId());
		a.setApellidos(request.getParameter("apellidosAlumno"));
		a.setCurso(request.getParameter("cursoAlumno"));
		a.setDireccion(request.getParameter("direccionAlumno"));
		a.setNombre(request.getParameter("nombreAlumno"));

		request.setAttribute("listAlumno", repoAlumno);
		*/
		
		
		
	}
	

}

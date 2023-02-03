/*
 * 
 */
package ejemploWebClase.web.Controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ejemploWebClase.entidades.Alumno;
import ejemploWebClase.entidades.AlumnoRepo;

// TODO: Auto-generated Javadoc
/**
 * The Class ControladorNoIndex.
 */
@Controller
public class ControladorNoIndex {

	/** The logger. */
	protected final Log logger = LogFactory.getLog(getClass());

	/**
	 * Gestion solicitud.
	 *
	 * @return the model and view
	 */
	@RequestMapping(value = "/segundaVista")
	public ModelAndView gestionSolicitud() {

		AlumnoRepo a = new AlumnoRepo();
		Map<String, Object> modelo = new HashMap<>();
		ArrayList<Alumno> listAlumnos = AlumnoRepo.listAlumnos();

		logger.info("Creamos la lista");
		modelo.put("ListaAlumnos", listAlumnos);
		logger.info("Nos movemos a la vista");

		logger.info("Lista de elementos en la lista " + listAlumnos.size());

		return new ModelAndView("noIndex", "miModelo", modelo);
	}

}

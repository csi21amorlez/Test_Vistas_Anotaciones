package ejemploWebClase.web.Controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejemploWebClase.entidades.Alumno;
import ejemploWebClase.entidades.AlumnoRepo;

/**
 * Servlet implementation class ControladorInsertAlumno
 */
@WebServlet(name = "ControladorInsertAlumno", urlPatterns = {"/ControladorInsertAlumno"})
public class ControladorInsertAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected ArrayList<Alumno> repoAlumno = AlumnoRepo.listAlumnos();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorInsertAlumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Alumno a = new Alumno();

		a.setId(repoAlumno.get(repoAlumno.size() + 1).getId());
		a.setApellidos(request.getParameter("apellidosAlumno"));
		a.setCurso(request.getParameter("cursoAlumno"));
		a.setDireccion(request.getParameter("direccionAlumno"));
		a.setNombre(request.getParameter("nombreAlumno"));

		request.setAttribute("listAlumno", repoAlumno);
		request.getRequestDispatcher("alumnosCreados").forward(request, response);
	}

}

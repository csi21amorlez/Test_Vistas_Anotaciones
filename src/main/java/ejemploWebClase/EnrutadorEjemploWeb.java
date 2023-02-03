package ejemploWebClase;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import ejemploWebClase.aplicacion.AplicacionConfiguracionContexto;
import ejemploWebClase.web.WebConfiguracionContexto;

// TODO: Auto-generated Javadoc
/**
 * The Class EnrutadorEjemploWeb.
 */
public class EnrutadorEjemploWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * Gets the root config classes.
	 *
	 * @return the root config classes
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class<?>[] { AplicacionConfiguracionContexto.class };
	}

	/**
	 * Gets the servlet config classes.
	 *
	 * @return the servlet config classes
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] { WebConfiguracionContexto.class };
	}

	/**
	 * Gets the servlet mappings.
	 *
	 * @return the servlet mappings
	 */
	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}

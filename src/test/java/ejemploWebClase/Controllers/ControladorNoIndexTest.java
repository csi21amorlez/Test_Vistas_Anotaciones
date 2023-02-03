/*
 * 
 */
package ejemploWebClase.Controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import ejemploWebClase.aplicacion.AplicacionConfiguracionContexto;
import ejemploWebClase.web.WebConfiguracionContexto;
import ejemploWebClase.web.Controllers.ControladorNoIndex;

// TODO: Auto-generated Javadoc
/**
 * The Class ControladorNoIndexTest.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes= {AplicacionConfiguracionContexto.class, WebConfiguracionContexto.class})
@WebAppConfiguration
public class ControladorNoIndexTest {
	
	/** The controller. */
	@Autowired
	private ControladorNoIndex controller;
	
	/**
	 * Test handle request view.
	 */
	@Test
	public void testHandleRequestView() {
		ModelAndView modenAnView = controller.gestionSolicitud();
		
	}
	
	

}

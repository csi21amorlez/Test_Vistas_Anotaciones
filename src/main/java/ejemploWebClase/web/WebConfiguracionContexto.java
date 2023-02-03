/*
 * 
 */
package ejemploWebClase.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// TODO: Auto-generated Javadoc
/**
 * The Class WebConfiguracionContexto.
 */
@ComponentScan
@Configuration
@EnableWebMvc
public class WebConfiguracionContexto {
	
	/**
	 * Mapping.
	 *
	 * @return the view resolver
	 */
	@Bean
	public ViewResolver mapping() {
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("/views/");
		irvr.setSuffix(".jsp");
		return irvr;
	}

}

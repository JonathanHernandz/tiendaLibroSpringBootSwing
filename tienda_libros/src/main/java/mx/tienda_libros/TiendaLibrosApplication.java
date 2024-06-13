package mx.tienda_libros;

import mx.tienda_libros.vista.LibroForm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;

@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) {
//		SpringApplication. run(TiendaLibrosApplication.class, args);

		ConfigurableApplicationContext contextoSpring = new SpringApplicationBuilder(TiendaLibrosApplication.class)
				.headless(false).web(WebApplicationType.NONE).run(args); // Hacemos esto ya que no es una aplicacion web
																		// para que no se ejecute como una aplicacion web

		// Ejecutamos el codigo para cargar el formulario
//		java.awt.EventQueue
		EventQueue.invokeLater(()->{
			// Obtenemos el objeto form a traves de Spring
			LibroForm libroForm = contextoSpring.getBean(LibroForm.class);
			libroForm.setVisible(true);
		});
	}

}

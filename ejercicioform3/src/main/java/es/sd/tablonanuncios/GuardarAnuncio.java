package es.sd.tablonanuncios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuardarAnuncio {
	@Autowired
	private ListaAnuncio anuncios;
	
	@RequestMapping(value="/enviaranuncio")
	public String guardar(Anuncio anuncio,
			              Model model) {
		
		anuncios.añadirAnuncio(anuncio);

		return "exito";
	}
}

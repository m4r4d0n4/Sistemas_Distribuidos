package es.sd.tablonanuncios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuardarAnuncio {
	static ArrayList<Anuncio> anuncios = new ArrayList<Anuncio>();
	
	
	@RequestMapping(value="/guardar")
	public String guardar(Anuncio anuncio,
			              Model model) {
		anuncios.add(anuncio);
		model.addAttribute("anuncio", anuncio);
		model.addAttribute("anuncios",anuncios);

		return "resultado";
	}
}

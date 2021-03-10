package es.sd.tablonanuncios;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuardarAnuncio {

	@RequestMapping(value="/guardar")
	public String guardar(Anuncio anuncio,
			              Model model) {
		
		model.addAttribute("anuncio", anuncio);	

		return "resultado";
	}
}

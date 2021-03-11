package es.sd.tablonanuncios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TablonAnuncios {
	
	@Autowired
	ListaAnuncio anuncios;
	
	
	@RequestMapping(value="/")
	public String guardar(Anuncio anuncio,
			              Model model) {
		
		model.addAttribute("anuncios",anuncios.getAnuncios());

		return "tablon";
	}
}
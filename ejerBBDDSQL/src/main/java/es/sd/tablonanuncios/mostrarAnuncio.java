package es.sd.tablonanuncios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mostrarAnuncio {
	
	@Autowired
	private AnuncioRepository anuncios;
	
	@RequestMapping(value="/anuncio")
	public String guardar(@RequestParam int id,
			              Model model) {
		List<Anuncio> variosanuncios = anuncios.findAll();	
		
		model.addAttribute("anuncio",variosanuncios.get(id));

		return "mostrarAnuncio";
	}
}

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
	ListaAnuncio anuncios;
	
	@RequestMapping(value="/enviar_anuncio")
	public String guardar(@RequestParam int id,
			              Model model) {
		
		model.addAttribute("anuncio",anuncios.getAnuncios().get(id));

		return "mostrarAnuncio";
	}
}

package es.sd.tablonanuncios;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TablonAnuncios {
	@Autowired
	private AnuncioRepository anuncios;
	
	@PostConstruct
	public void init() {
		anuncios.save(new Anuncio("AAA","BBB","CCC"));
		anuncios.save(new Anuncio("DDD","EEE","FFF"));
	}
	
	
	@RequestMapping(value="/")
	public String guardar(Anuncio anuncio,
			              Model model) {
		
		model.addAttribute("anuncios",anuncios.findAll());

		return "tablon";
	}
}
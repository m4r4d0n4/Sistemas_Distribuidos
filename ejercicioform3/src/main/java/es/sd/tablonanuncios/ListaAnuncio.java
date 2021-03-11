package es.sd.tablonanuncios;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class ListaAnuncio {
	private ArrayList<Anuncio> lista = new ArrayList<Anuncio>();
	
	public ListaAnuncio(ArrayList<Anuncio> lista) {
		this.lista=lista;
	}
	public ArrayList<Anuncio> getAnuncios() {
		return this.lista;
	}
	public void añadirAnuncio(Anuncio anuncio) {
		this.lista.add(anuncio);
	}
}

package es.sd.tablonanuncios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnuncioRepository extends JpaRepository<Anuncio,Long>{
	
	Anuncio findByNombre(String nombre);

	Anuncio findByAsunto(String asunto);
	Anuncio findById(long id);

	List<Anuncio> findByNombreAndAsunto(String nombre,String asunto);
}

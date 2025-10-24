package cl.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.web.model.Contacto;

@Service //marca la clase como componente de lógica de negocio. Permite que Spring la inyecte en el controlador con @Autowired.
public class ContactoServiceImpl implements ContactoService{
	private static List<Contacto> contactos = new ArrayList<>();

	@Override
	public void agregar(Contacto contacto) {
		contactos.add(contacto);
		
	}

	@Override
	public List<Contacto> obtenerTodos() {
		return contactos;
	}

	@Override
	public Contacto buscarPorNombre(String nombre) {
		for (Contacto c : contactos) {
	        if (c.getNombre().equalsIgnoreCase(nombre)) {
	            return c;
	        }
	    }
	    return null;
	}

}

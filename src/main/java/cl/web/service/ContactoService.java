package cl.web.service;

import java.util.List;
import cl.web.model.Contacto;

public interface ContactoService {
    void agregar(Contacto contacto);
    List<Contacto> obtenerTodos();
    Contacto buscarPorNombre(String nombre);
}
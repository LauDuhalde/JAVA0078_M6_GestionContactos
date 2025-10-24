package cl.web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cl.web.model.Contacto;
import cl.web.service.ContactoServiceImpl;

@SpringBootTest
class ContactoServiceTests {

    @Autowired
    private ContactoServiceImpl service;

    @Test
    void agregarYListarContactos() {
        Contacto c = new Contacto("Laura", "laura@mail.com", "123456");
        service.agregar(c);

        assertEquals(1,service.obtenerTodos().size());
    }
    
    @Test
    void buscarPorNombre() {
        Contacto c = new Contacto("Laura", "laura@mail.com", "123456");
        service.agregar(c);
        
        assertNull(service.buscarPorNombre("Pedro"));
        assertNotNull(service.buscarPorNombre("Laura"));
    }
}
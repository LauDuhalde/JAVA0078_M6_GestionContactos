package cl.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.web.model.Contacto;
import cl.web.service.ContactoServiceImpl;

@Controller
public class ContactoController {
	
    @Autowired
    private ContactoServiceImpl contactoService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        return "formulario";
    }
    
    @GetMapping("formulario")
    public String mostrarFormulario(Model model) {
        return "formulario";
    }
    
    @PostMapping("/guardar")
    public String guardarProducto(@RequestParam String nombre, @RequestParam String correo, @RequestParam String telefono, Model model) {
        // Procesar los datos
    	Contacto contacto = new Contacto(nombre, correo, telefono);
    	contactoService.agregar(contacto);
        model.addAttribute("mensaje", "Contacto agregado correctamente");
        return "redirect:/lista";
    }
    
    @GetMapping("/lista")
    public String listarProductos(Model model) {
    	model.addAttribute("contactos", contactoService.obtenerTodos());
        return "lista";
    }
}

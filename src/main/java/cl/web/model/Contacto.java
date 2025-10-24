package cl.web.model;

import org.springframework.stereotype.Component;

@Component //le dice a Spring que esta clase es un bean gestionado, es decir, puede ser inyectada con @Autowired
public class Contacto {
    private String nombre;
    private String correo;
    private String telefono;

    public Contacto() {
    	
    }

    public Contacto(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
    
    
}

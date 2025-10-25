package cl.web.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component //para que se pueda registrar en el contexto de spring.
@Data //para que se puedan usar los getters y setters.
@NoArgsConstructor //para que se puedan crear objetos sin atributos.
@AllArgsConstructor //para que se puedan crear objetos con todos sus atributos.
public class Contacto {

    private String nombre;
    private String correo;
    private String telefono;
}

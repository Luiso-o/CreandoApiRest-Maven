package cat.itacademy.barcelona.Apellidos.nombre.s04.t01.n01.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/saludaConParametro")
    public String saluda(@RequestParam(value = "nombre", defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven!";
    }

    @GetMapping({"/saludaConVariable","/saludaConVariable/{nombre}"})
    public String saluda2(@PathVariable (required = false) String nombre) {
        return "Hola, " + (nombre != null ? nombre : "UNKNOWN") + ". Estás ejecutando un proyecto Maven!";
    }

}

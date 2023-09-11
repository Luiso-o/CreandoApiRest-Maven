package cat.itacademy.barcelona.Apellidos.nombre.s04.t01.n01.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSaludaSinNombre() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/saludaConParametro")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hola, UNKNOWN. Estás ejecutando un proyecto Maven!"));
    }

    @Test
    public void testSaludaConNombre() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/saludaConParametro?nombre=Karla")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hola, Karla. Estás ejecutando un proyecto Maven!"));
    }

    @Test
    public void testSaludaConVariableSinNombre() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/saludaConVariable")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hola, UNKNOWN. Estás ejecutando un proyecto Maven!"));
    }

    @Test
    public void testSaludaConVariableConNombre() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/saludaConVariable/TúNombre")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hola, TúNombre. Estás ejecutando un proyecto Maven!"));
    }


}
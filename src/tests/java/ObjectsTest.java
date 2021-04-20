import org.junit.jupiter.api.Test;

import Personas.Clientes;
import Personas.DirectorProyecto;
import Personas.Disenadores;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObjectsTest {

    @Test
    public void ClientesTest() {
        Clientes clienteLaura = new Clientes('Laura', 'Foticos SL', 1055, 0.0, 'Laura Robledillo Peña');
        assertEquals(clienteLaura.getNombre(), 'Laura');
        // Demás propiedades
        assertEquals(clienteLaura.getNombreEmpresa(), 'Foticos SL');
    }

    @Test
    public void DisenadorTest() {
        Disenadores diseEli = new Disenadores('Eli', 'Diseño', 20, 1500.0, 'eli@foticos.org');
        assertEquals(diseEli.getNombre(), 'Eli');
    }

    @Test
    public void DirectorProyectoTest() {
        DirectorProyecto dirSalo = new DirectorProyecto('Salo', 'Des y Sis', 10, 8.5, 'salo@foticos.org');
        assertEquals(dirSalo.getNumeroProyectos(), 10);
    }
}

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
        assertEquals(clienteLaura.getNombreEmpresa(), 'Foticos SL');
        assertEquals(clienteLaura.getId_cliente(), 1055);
        assertEquals(clienteLaura.getId_Deuda(), 0.0);
        assertEquals(clienteLaura.getId_Descripcion(), 'Laura Robledillo Peña');
    }

    @Test
    public void DisenadorTest() {
        Disenadores diseEli = new Disenadores('Eli', 'Diseño', 20, 1500.0, 'eli@foticos.org');
        assertEquals(diseEli.getNombre(), 'Eli');
        assertEquals(diseEli.getDepartamento(), 'Diseño');
        assertEquals(diseEli.getNumeroProyectos(), 20);
        assertEquals(diseEli.getSueldo(), 1500.0);
        assertEquals(diseEli.getEmail(), 'eli@foticos.org');
    }

    @Test
    public void DirectorProyectoTest() {
        DirectorProyecto dirSalo = new DirectorProyecto('Salo', 'Des y Sis', 10, 8.5, 'salo@foticos.org');
        assertEquals(dirSalo.getNombre(), 'Salo');
        assertEquals(dirSaloeSalo.getDepartamento(), 'Dis y Sis');
        assertEquals(dirSalo.getNumeroProyectos(), 10);
        assertEquals(dirSalo.getAntiguedad(), 8.5);
        assertEquals(diseEli.getEmail(), 'salo@foticos.org');

    }
}

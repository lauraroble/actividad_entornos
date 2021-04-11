package Act_2eval;

import java.util.Objects;

public class Clientes {
    private String nombre;
    private String nombreEmpresa;
    private int id_cliente;
    private float deuda;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clientes)) return false;
        Clientes clientes = (Clientes) o;
        return getId_cliente() == clientes.getId_cliente() &&
                Float.compare(clientes.getDeuda(), getDeuda()) == 0 &&
                Objects.equals(getNombre(), clientes.getNombre()) &&
                Objects.equals(getNombreEmpresa(), clientes.getNombreEmpresa()) &&
                Objects.equals(getDescripcion(), clientes.getDescripcion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getNombreEmpresa(), getId_cliente(), getDeuda(), getDescripcion());
    }

    public Clientes(String nombre, String nombreEmpresa, int id_cliente, float deuda, String descripcion) {
        this.nombre = nombre;
        this.nombreEmpresa = nombreEmpresa;
        this.id_cliente = id_cliente;
        this.deuda = deuda;
        this.descripcion = descripcion;
    }
}

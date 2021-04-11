package Act_2eval;

import java.util.Objects;

public class Diseñadores {
    private String nombre;
    private String departamento;
    private int numeroProyectos;
    private float sueldo;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumeroProyectos() {
        return numeroProyectos;
    }

    public void setNumeroProyectos(int numeroProyectos) {
        this.numeroProyectos = numeroProyectos;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Diseñadores)) return false;
        Diseñadores that = (Diseñadores) o;
        return getNumeroProyectos() == that.getNumeroProyectos() &&
                Float.compare(that.getSueldo(), getSueldo()) == 0 &&
                Objects.equals(getNombre(), that.getNombre()) &&
                Objects.equals(getDepartamento(), that.getDepartamento()) &&
                Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getDepartamento(), getNumeroProyectos(), getSueldo(), getEmail());
    }

    public Diseñadores(String nombre, String departamento, int numeroProyectos, float sueldo, String email) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.numeroProyectos = numeroProyectos;
        this.sueldo = sueldo;
        this.email = email;
    }
}

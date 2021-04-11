package Act_2eval;

import java.util.Objects;

public class DirectorProyecto {

    private String nombre;
    private String departamento;
    private int numeroProyectos;
    private float antiguedad;
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

    public float getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(float antiguedad) {
        this.antiguedad = antiguedad;
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
        if (!(o instanceof DirectorProyecto)) return false;
        DirectorProyecto that = (DirectorProyecto) o;
        return getNumeroProyectos() == that.getNumeroProyectos() &&
                Float.compare(that.getAntiguedad(), getAntiguedad()) == 0 &&
                Objects.equals(getNombre(), that.getNombre()) &&
                Objects.equals(getDepartamento(), that.getDepartamento()) &&
                Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getDepartamento(), getNumeroProyectos(), getAntiguedad(), getEmail());
    }

    public DirectorProyecto(String nombre, String departamento, int numeroProyectos, float antiguedad, String email) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.numeroProyectos = numeroProyectos;
        this.antiguedad = antiguedad;
        this.email = email;
    }


}

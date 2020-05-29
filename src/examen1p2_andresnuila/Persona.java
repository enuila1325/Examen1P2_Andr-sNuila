package examen1p2_andresnuila;

public class Persona {
    protected String id, nombre, sexo, estadoCivil;
    protected double altura, peso;

    public Persona() {
    }

    public Persona(String id, String nombre, String sexo, String estadoCivil, double altura, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.altura = altura;
        this.peso = peso;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", estado Civil=" + estadoCivil + '}';
    }
    
    
}

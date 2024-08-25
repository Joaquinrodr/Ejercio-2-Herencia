public class Animal {

    // ATRIBUTOS
    private String nombre;
    private String sexo;
    private double peso;
    private String alimentacion;
    private String raza;
    private String colorPelaje;

    // CONSTRUCTOR
    public Animal(String nombre, String sexo, double peso, String alimentacion, String raza, String colorPelaje) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.alimentacion = alimentacion;
        this.raza = raza;
        this.colorPelaje = colorPelaje;
    }

    // GETTERS Y SETTERS
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

}
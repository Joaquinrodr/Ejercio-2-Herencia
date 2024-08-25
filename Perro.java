public class Perro extends Animal {
    // ATRIBUTOS
    private String oficioPerro;

    // CONSTRUCTOR
    public Perro(String oficioPerro, String nombre, String sexo, double peso, String alimentacion, String raza,
            String colorPelaje) {
        super(nombre, sexo, peso, alimentacion, raza, colorPelaje);
        this.oficioPerro = oficioPerro;
    }

    // GETTERS Y SETTERS
    public String getOficioPerro() {
        return oficioPerro;
    }

    public void setOficioPerro(String oficioPerro) {
        this.oficioPerro = oficioPerro;
    }

}

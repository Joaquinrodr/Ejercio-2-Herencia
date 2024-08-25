public class Caballo extends Animal {
    // ATRIBUTOS
    private boolean domesticado;
    private boolean agilidad;

    // CONSTRUCTOR
    public Caballo(boolean domesticado, boolean agilidad, String nombre, String sexo, double peso, String alimentacion,
            String raza, String colorPelaje) {
        super(nombre, sexo, peso, alimentacion, raza, colorPelaje);
        this.domesticado = domesticado;
        this.agilidad = agilidad;
    }

    // GETTERS Y SETTERS
    public boolean isDomesticado() {
        return domesticado;
    }

    public void setDomesticado(boolean domesticado) {
        this.domesticado = domesticado;
    }

    public boolean isAgilidad() {
        return agilidad;
    }

    public void setAgilidad(boolean agilidad) {
        this.agilidad = agilidad;
    }

}
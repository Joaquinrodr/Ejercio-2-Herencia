public class Gato extends Animal {

    private String formaDeOrejas;

    public Gato(String formaDeOrejas, String nombre, String sexo, double peso, String alimentacion, String raza,
            String colorPelaje) {
        super(nombre, sexo, peso, alimentacion, raza, colorPelaje);
        this.formaDeOrejas = formaDeOrejas;
    }

    public String getFormaDeOrejas() {
        return formaDeOrejas;
    }

    public void setFormaDeOrejas(String formaDeOrejas) {
        this.formaDeOrejas = formaDeOrejas;
    }
}
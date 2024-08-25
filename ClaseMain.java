public class ClaseMain {

    public static void main(String[] args) {
        // INSTANCIAMIENTO DE LOS OBJETOS
        Perro perro1 = new Perro("Policia", "Frida", "hembra", 10, "omnivoro", "Salchicha", "marron");

        Caballo caballo1 = new Caballo(true, true, "Juan", "Macho", 450, "Herbivoros", "Arabe", "Gris");

        Gato gato1 = new Gato("Redondas", "totono", "Macho", 5, "omnivoro", "Anaranjado", "Naranja");

        // COMUNICACIÓN CON LOS OBJETOS (MSJ)
        String nombrePerro1 = perro1.getNombre();
        String nombreCaballo1 = caballo1.getNombre();
        String nombreGato1 = gato1.getNombre();

        System.out.println("---------------NOMBRES---------------------");

        System.out.println("El nombre del perro 1 es: " + nombrePerro1);
        System.out.println("El nombre del caballo 1 es: " + nombreCaballo1);
        System.out.println("El nombre del gatoo 1 es: " + nombreGato1);

        System.out.println("---------------ALIMENTACIÓN---------------------");

        String AlimentacionPerro1 = perro1.getAlimentacion();
        String AlimentacionCaballo1 = caballo1.getAlimentacion();
        String AlimentacionGato1 = gato1.getAlimentacion();

        System.out.println("La alimentación del perro 1 es: " + AlimentacionPerro1);
        System.out.println("La alimentación del caballo 1 es: " + AlimentacionCaballo1);
        System.out.println("La alimentación del gatoo 1 es: " + AlimentacionGato1);

        System.out.println("---------------CAMBIOS DE NOMBRE-----------------");

        perro1.setNombre("Lola");
        caballo1.setNombre("Tiro al blanco");
        gato1.setNombre("Gaturro");

        nombrePerro1 = perro1.getNombre();
        nombreCaballo1 = caballo1.getNombre();
        nombreGato1 = gato1.getNombre();

        System.out.println("El nombre del perro 1 es: " + nombrePerro1);
        System.out.println("El nombre del caballo 1 es: " + nombreCaballo1);
        System.out.println("El nombre del gatoo 1 es: " + nombreGato1);

    }
}

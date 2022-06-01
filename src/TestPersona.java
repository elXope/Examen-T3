public class TestPersona {
    public static void main(String[] args) {
        Persona juan = new Persona("Juan", "Perez Perez", 19, "535353535H", "C/ Ueue nº3");
        Persona nerea = new Persona("Nerea", "De La Rosa Moreno", 44, "111111F", "C/ Alegria nº22 1º C");

        juan.serializar();
        nerea.serializar();
    }
}

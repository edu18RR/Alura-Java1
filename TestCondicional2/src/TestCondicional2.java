public class TestCondicional2 {

    public static void main(String[] args) {
        System.out.println("probando condicionales");

        int edad = 16;
        int cantidadPersonas = 3;        

        if (edad >=18 || cantidadPersonas >=2) {
            System.out.println("Bienvenido"); 
        } else {
            System.out.println("Lamentablemente no puedes ingresar");
        }
    }
}
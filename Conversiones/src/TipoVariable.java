public class TipoVariable {
    public static void main(String[] args) throws Exception {

        double variable1 = 230.89;
        int variable1Entero = (int) variable1; //Cast
        //este metodo imprime en consola
        System.out.println(variable1Entero);

        int resultado = (int) variable1 + variable1Entero;
        System.out.println(resultado);

    }
}

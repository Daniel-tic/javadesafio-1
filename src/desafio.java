import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("********************");
        System.out.println("\nNombre de cliente: "+ nombre);
        System.out.println("El tipo de cuenta es: "+ tipoDeCuenta);
        System.out.println("\n********************");

        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt(); // para salir opcion 9

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo){
                        System.out.println("Le falta money");
                    }else{
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldo + "$");
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo +=valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("opcion no valida");

            }

        }
    }

}

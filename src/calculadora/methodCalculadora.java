package calculadora;

import java.util.Scanner;

public class CalculadoraConMetodos {

    static Scanner teclado = new Scanner(System.in);
    static int num1, num2, opcion;
    public static void main(String[] args) {
        float resultado=0;
        menu();
        validacion_menu();
        validacion_numeros();
        resultado=menu_opciones();
        System.out.println("La operacion retorna: "+resultado);


    }

    static void menu() {
        System.out.println("Seleccione una operacion: "+"\n 1. Sumar"+" 2. Restar"+" 3. Multiplicar"+"\n 4. Dividir"+" 5. Encontrar mayor"+" 6. Calcular potencia"+" 7. Salir");

    }

    static float menu_opciones() {
        float resultado=0;
        switch (opcion) {

            case 1:
                resultado=Suma(num1, num2);
                break;

            case 2:
                resultado=Resta(num1, num2);
                break;

            case 3:
                resultado=Multiplicacion(num1, num2);
                break;

            case 4:
                resultado=Division(num1, num2);
                break;

            case 5:
                resultado=Comparacion(num1, num2);
                break;

            case 6:
                resultado=Potencia(num1, num2);
                break;

            case 7:
                System.out.println("Terminando...");
                System.exit(0);
                break;

            default:
                System.out.println("Elección invalida");
        }
        return resultado;

    }



    static float Suma(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    static float Resta(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    static float Multiplicacion(int num1, int num2) {
        int mult = (num1 * num2);
        return mult;
    }

    static float Division(int num1, int num2) {
        float div = (num1 / num2);
        return div;
    }


}

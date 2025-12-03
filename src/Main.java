import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> opciones = new ArrayList<>();
        Random random = new Random();

        System.out.println("Cuantas opciones tienes?: ");
        int s;
        try {
             s = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Ingresa valores numericos");
            return;
        }
            for (int i = 0; i < s; i++) {
                System.out.println("Ingresa las opcion " + (i + 1) + " que tienes: ");
                String op = sc.nextLine();
                opciones.add(op);
            }

            while (true) {

                System.out.println("Estas listo para ver el resultado?: ");
                String respuesta = sc.nextLine();

                if (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI")) {
                    int indiceAleatorio = random.nextInt(opciones.size());
                    System.out.println("Se ha seleccionado la opcion "+ (indiceAleatorio+1) + ": " + opciones.get(indiceAleatorio));
                    break;
                } else{
                    System.out.println("Ingresa si o no");
                }
            }
        }
    }

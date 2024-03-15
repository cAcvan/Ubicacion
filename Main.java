import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private ArrayList<Ubicacion> ubicaciones = new ArrayList<Ubicacion>();

    public Main(){
        ubicaciones.add(0, new Ubicacion(0, "Estás sentado en la clase de programación"));
        ubicaciones.add(1, new Ubicacion(1, "Estás en la cima de una montaña"));
        ubicaciones.add(2, new Ubicacion(2, "Estás bañándote en la playa"));
        ubicaciones.add(3, new Ubicacion(3, "Estás dentro de un edificio muy alto"));
        ubicaciones.add(4, new Ubicacion(4, "Estás de pie en un puente"));
        ubicaciones.add(5, new Ubicacion(5, "Estás en un bosque"));


        ubicaciones.get(1).addExit("N", 5);
        ubicaciones.get(1).addExit("S", 4);
        ubicaciones.get(1).addExit("E", 3);
        ubicaciones.get(1).addExit("O", 2);
        ubicaciones.get(1).addExit("Q", 0);

        ubicaciones.get(2).addExit("N", 5);
        ubicaciones.get(2).addExit("Q", 0);

        ubicaciones.get(3).addExit("O", 1);
        ubicaciones.get(3).addExit("Q", 0);

        ubicaciones.get(4).addExit("N", 1);
        ubicaciones.get(4).addExit("O", 2);
        ubicaciones.get(4).addExit("Q", 0);

        ubicaciones.get(5).addExit("S", 1);
        ubicaciones.get(5).addExit("O", 2);
        ubicaciones.get(5).addExit("Q", 0);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m  = new Main();

        String opcion = "";
        int num =1;

        System.out.println(m.ubicaciones.get(1).getDescripcion());
        System.out.println("Direcciones disponibles: ");

        for(Map.Entry<String, Integer> entry: m.ubicaciones.get(1).getExist().entrySet()){
            System.out.print(entry.getKey() + " ");
        }

        System.out.println();

        do {
            System.out.println("Ingresa la opción: ");
            opcion = sc.next();

            if(!opcion.equalsIgnoreCase("Q")){
                for(Map.Entry<String, Integer> entry: m.ubicaciones.get(num).getExist().entrySet()){
                    if(opcion.equalsIgnoreCase(entry.getKey())){
                        num = entry.getValue();
                    }
                }
                System.out.println(m.ubicaciones.get(num).getDescripcion());

                System.out.println("Direcciones disponibles: ");
                for(Map.Entry<String, Integer> entry: m.ubicaciones.get(num).getExist().entrySet()){
                    System.out.print(entry.getKey() + " ");
                }
            }
        }while (!opcion.equalsIgnoreCase("Q"));
        System.out.println("Adiós.");
    }
}

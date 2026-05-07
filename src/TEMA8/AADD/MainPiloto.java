package TEMA8.AADD;

import java.util.Scanner;

public class MainPiloto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 9;
        while (opcion != 0) {
            System.out.println("\n que quieres hacer?");
            System.out.println("0. salir \n1. \n2. \n3. \n4. \n5. \n6. \n7.");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:
                    PilotosCRUD b = new PilotosCRUD();
                    System.out.println("pon el codigo del piloto");
                    int driverid = sc.nextInt();
                    b.ReadPilot(driverid);
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    PilotosCRUD h = new PilotosCRUD();
                    h.ShowBuildersClassification();
                    break;

            }
        }
    }
}

package Program;

import Method.DanhBaManager;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        DanhBaManager danhBaManager = new DanhBaManager();
        Menu menu = new Menu();
        Input input = new Input();
        do {
            System.out.println("-------------MENU-----------");
            System.out.println("1.Add DanhBa.");
            System.out.println("2.Display All ");
            System.out.println("3.Update by Phone ");
            System.out.println("4.Delete ");
            System.out.println("5.Find ");
            System.out.println("6.Read from File ");
            System.out.println("7.Write from File ");
            System.out.println("0.EXIT.");
            int choice = input.inputINT("Choice");
            System.out.println("-------------------------");
            switch (choice) {
                case 1:
                    menu.menu1(danhBaManager);
                    System.out.println("-----------------------");
                    break;
                case 2:
                    menu.menu2(danhBaManager);
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    menu.menu3(danhBaManager);
                    System.out.println("-------------------------------");
                    break;
                case 4:
                    menu.menu4(danhBaManager);
                    System.out.println("-------------------------------");
                    break;
                case 5:
                    menu.menu5(danhBaManager);
                    System.out.println("---------------------------------");
                    break;
                case 6:


                case 7:


                case 0:
                    System.exit(0);
                default:


            }
        } while (true);
    }
}

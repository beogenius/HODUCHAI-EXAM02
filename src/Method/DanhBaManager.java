package Method;

import Entities.DanhBa;
import Program.Input;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhBaManager {

    ArrayList<DanhBa> list = new ArrayList<>();

    Scanner scanner=new Scanner(System.in);




    public void add(DanhBa danhBa){
        list.add(danhBa);
    }

    public void displayALL(){
        for (DanhBa d: list) {
            System.out.println(d.toString());
        }
    }

    public void update() {

        System.out.println("Please input Phone");
        String num =scanner.nextLine();
        for (DanhBa d :list) {
            if(d.getPhone().equals(num)){
                //int phone, String group, String name, String gender, String address, LocalDate birthday, String email
                System.out.println("Input name");
                d.setName(scanner.nextLine());
                System.out.println("Input Group");
                d.setGroup(scanner.nextLine());
                System.out.println("Input gender");
                d.setGender(scanner.nextLine());
                System.out.println("Input address");
                d.setAddress(scanner.nextLine());
                /*System.out.println("Input birthday");
                d.setBirthday(LocalDate.parse(scanner.nextLine()));*/
                System.out.println("Input email");
                d.setEmail(scanner.nextLine());
            }
            else{
                System.out.println("Cannot find phone number");
            }
        }
    }

    public void delete() {
        System.out.println("Input Phonenumber you want to delete");
        String num = scanner.nextLine();
        for (DanhBa d: list) {
            if (d.getPhone().equals(num)){
                list.remove(d);
            }
            else{
                System.out.println("Cannot find phone number");
            }
        }
    }

    public void find() {
        System.out.println("Input phone number you want to find");
        String num = scanner.nextLine();
        for (DanhBa d: list) {
            if (d.getPhone()==num){
                d.toString();
            }
            else {
                System.out.println("Cannot find ");
            }
        }
    }
}

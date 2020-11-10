package Program;

import Entities.DanhBa;

import java.time.LocalDate;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);
    private static ValidateInput val = new ValidateInput();

    public DanhBa inputDanhBa(){
        Scanner scanner = new Scanner(System.in);
        //int phone, String group, String name, String gender, String address, LocalDate birthday, String email
        String phone = inputPhone("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$");
        String group = inputString("Group");
        String name = inputString("Name");
        String gender = inputString("Gender ( M / F )");
        String address = inputString("Address");
        LocalDate birthday = inputDate("BirthDay");
        String email = inputEmail("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

        return new DanhBa (phone,group,name,gender,address,birthday,email);
    }





    public LocalDate inputDate(String str){
        LocalDate date;
        try{
            System.out.println("Enter "+str+":");
            int day = inputINT("day");
            int month = inputINT("month");
            int year = inputINT("year");
            date = LocalDate.of(year,month,day);
        }catch (Exception e){
            System.out.println("Your date you input is not exist!");
            date = inputDate(str);
        }
        return date;
    }

    public String inputString(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter "+str+":");
        String result = scanner.nextLine();
        if(result.equals("")){
            System.out.println("You have not enter "+str+"!");
            result = inputString(str);
        }
        return result;
    }
    public static String inputEmail(String regex){
        System.out.println("Please input Email");
        String result = scanner.nextLine();
        if(!val.isValidate(regex,result)){
            System.out.println("Your input is wrong!");
            System.out.println("Please input again");
            result = inputEmail(regex);
        }
        return result;
    }

    public static String inputPhone(String regex){
        System.out.println("Please input Phone Number (Regex in use: number 0>9) ");
        String result = scanner.nextLine();
        if(!val.isValidate(regex,result)){
            System.out.println("Your input is wrong!");
            System.out.println("Please input again");
            result = inputPhone(regex);
        }
        return result;
    }


    public int inputINT(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter "+str+":");
        int result = 0;
        try{
            result = Integer.parseInt(scanner.nextLine());
        }catch (Exception e){
            System.out.println(str+" must be a number!");
            result = inputINT(str);
        }
        return result;
    }
}

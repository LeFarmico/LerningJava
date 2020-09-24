package Unit13_InOutFilesDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Unit_13_2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую дату");
        String date1 = scanner.nextLine();
        System.out.println("Введите первую дату");
        String date2 = scanner.nextLine();

        long days = -1;
        try{
            Date firstDate = sdf.parse(date1);
            Date secondDate = sdf.parse(date2);
            days = Math.round((firstDate.getTime() - secondDate.getTime()) / (double) 86400000);
        }catch (ParseException e){
            System.out.println("Не верный формат даты!");
        }

        System.out.println(Math.abs(days) + " дней между датами");
    }

}

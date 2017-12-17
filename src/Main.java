import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String [] firstName =  { "Anna", "Piotr", "Adam", "Monika", "Zbigniew", "Danuta",
                "Jerzy", "Jadwiga", "Tadeusz", "Aleksandra", "Mateusz", "Halina",
                "Dariusz", "Irena", "Mariusz"  };
        String [] lastName = {"Nowak", "Kowalski", "Wiśniewski", "Wójcik", "Kowalczyk",
                "Kamiński", "Lewandowski", "Zieliński", "Szymański", "Woźniak",
                "Dąbrowski", "Kozłowski", "Jankowski", "Mazur", "Wojciechowski",
                "Kwiatkowski", "Krawczyk", "Kaczmarek", "Piotrowski", "Grabowski" };

        String [] gender = {"Female", "Male"};

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        String choice = scanner.next();
        String name;
        name = firstName[rand.nextInt(firstName.length)];
        if(choice.equals("Female"))
            while(name.charAt(name.length()-1)!='a')
                name = firstName[rand.nextInt(firstName.length)];
        else
            do{
                name = firstName[rand.nextInt(firstName.length)];
            }
            while(name.charAt(name.length()-1)=='a');

        System.out.println("First Name: " + name );
        System.out.println("Last Name: " + lastName[rand.nextInt(lastName.length)] );

    }
}

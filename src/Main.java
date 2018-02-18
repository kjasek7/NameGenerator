import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String [] firstName =  { "Anna", "Piotr", "Adam", "Monika", "Zbigniew", "Danuta",
                "Jerzy", "Jadwiga", "Tadeusz", "Aleksandra", "Mateusz", "Halina",
                "Dariusz", "Irena", "Mariusz"  };
        final String [] lastName = {"Nowak", "Kowalski", "Wiśniewski", "Wójcik", "Kowalczyk",
                "Kamiński", "Lewandowski", "Zieliński", "Szymański", "Woźniak",
                "Dąbrowski", "Kozłowski", "Jankowski", "Mazur", "Wojciechowski",
                "Kwiatkowski", "Krawczyk", "Kaczmarek", "Piotrowski", "Grabowski" };

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        String choice = scanner.next();
        String name;
        String lastname =lastName[rand.nextInt(lastName.length)];

        name = firstName[rand.nextInt(firstName.length)];
        if(choice.equals("Female")) {
            while (name.charAt(name.length() - 1) != 'a')
                name = firstName[rand.nextInt(firstName.length)];

            if( lastname.charAt(lastname.length()-1) == 'i')
            {
                lastname = lastname.substring(0,lastname.length()-1) + 'a';
            }

        }
        else if(choice.equals("Male"))
            do{
                name = firstName[rand.nextInt(firstName.length)];
            }
            while(name.charAt(name.length()-1)=='a');

        System.out.println("First Name: " + name );
        System.out.println("Last Name: " + lastname );

    }
}

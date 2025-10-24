import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        DogWalkCompany c = new DogWalkCompany();
        System.out.println(c);
        int hour = c.addDogs();
        System.out.println(c);
        DogWalker w = new DogWalker(4, c);
        System.out.println(w.walkDogs(hour)+" dogs walked.");
        System.out.println(c.numAvailableDogs(hour)+ " dogs remaining.");
        for (int i = 7; i < 11; i++)
            c.addDogs();
        System.out.println(c);
        w = new DogWalker(3, c);
        System.out.println("$" + w.dogWalkingShift(7, 10) + ".00 earned");

    }
    public static int read() throws FileNotFoundException{
        int money = 0;
        DogWalkCompany[] companies = new DogWalkCompany[1000];
        File f = new File("Companies.txt");
        Scanner s = new Scanner(f);
        int index = 0;
        while(s.hasNextLine()){
            int[] dogs = new int[24];
            for (int i = 0; i < dogs.length; i++){
                dogs[i] = s.nextInt();
                companies[index] = new DogWalkCompany();
            }
        }

    }

 }


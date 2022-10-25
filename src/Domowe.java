import java.util.Scanner;

public class Domowe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Jak masz na imie");
        String name = sc.nextLine();
        System.out.println("Jak sie nazywasz");
        String surname = sc.nextLine();
        System.out.println("zonaty");
        boolean stanCywilny = sc.nextBoolean() ;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("jak masz na imie");
        String name = sc.nextLine();
        System.out.println("jak się nazywasz");
        String surmane = sc.nextLine();
        System.out.println("ile masz lat");
        int age =sc.nextInt();
        if (age <18) {
            System.out.println("Nie masz 18 lat, do widzenia");

        } else {
            System.out.println("Zapraszam");
        }
    }
}
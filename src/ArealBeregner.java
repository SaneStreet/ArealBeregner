import java.util.Scanner;

public class ArealBeregner {
    public static void main(String[] args) {
        //Spørger om et tal til Radius
        System.out.print("Indtast tallet for radius: ");
        //Scanner for bruger input til radius
        Scanner input = new Scanner(System.in);
        //Ny variabel der ideholder radius
        double radius = input.nextDouble();
        //udskriver hvad radius er
        System.out.println("Radius er " + radius);
        //udregner arealet vha. brugers input af radius
        double areal = radius * radius * 3.14;
        //Udskriver resultatet
        System.out.println("Arealet er : " + areal);
    }
}

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Suma de enteros");
        System.out.println(Suma(sc.nextInt(),sc.nextInt()));
        System.out.println("Suma de 3 enteros");
        System.out.println(Suma(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.println("Suma de 2 valores double");
        System.out.println(Suma(sc.nextDouble(), sc.nextDouble()));
        System.out.println("Suma de 3 valores double");
        System.out.println(Suma(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
    public static int Suma(int N1,int N2){
        return N1 + N2;
    }
    public static int Suma(int N1,int N2,int N3){
        return N1 + N2 + N3;
    }
    public static double Suma(double N1,double N2){
        return N1+N2;
    }
    public static double Suma(double N1,double N2, double N3){
        return N1+N2+N3;
    }
}
import java.util.Scanner;

public class Main {
    public static void chuvi(int a, int b){
        int chuvi1=0;
        chuvi1= (a+b)*2;
        System.out.println("chu vi la :"+chuvi1);
    }
    public static void dientich( int a ,int b){
        int dientich1=0;
        dientich1=a*b;
        System.out.println("dien tich la "+dientich1);
    }
    public static void main(String[] args) {
        int chieudai,chieurong;
        Scanner scanner = new Scanner(System.in);
        System.out.println("chieu dai");
        chieudai= scanner.nextInt();
        System.out.println("chieu rong");
        chieurong= scanner.nextInt();
        chuvi(chieudai,chieurong);
        dientich(chieudai,chieurong);
    }
}
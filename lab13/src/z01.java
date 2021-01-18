import java.util.PriorityQueue;
import java.util.Scanner;

public class z01 {

    public static void main(String[] args) {
        PriorityQueue<String> Que = new PriorityQueue<String>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            String temp = "";
            temp = scan.nextLine();
            if (temp.equals("nowe prio")) {
                System.out.println("Podaj zadanie");
                scan.reset();
                temp = scan.nextLine();
                Que.add(temp);
                scan.reset();
            }
            if (temp.equals("nastepne")) {
                Que.remove();
                System.out.println("Zadanie usuniete");
                scan.reset();
            }
            if (temp.equals("zakoncz")) {
                System.out.println("Praca programu zakonczona");
                break;
            }
        }
    }
}

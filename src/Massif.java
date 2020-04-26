import java.util.Scanner;

public class Massif {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива = ");
        int len = scanner.nextInt();
        int mass[]=new int[len];
        for (int i=0; i<len; i++) {
            System.out.printf("Введите число для массива %d = ", i);
            mass[i] = scanner.nextInt();
           }
        for (int i=0; i<len; i++){
            System.out.println("Элемент [" + i + "] :" + mass[i]*2);
        }
    }

}

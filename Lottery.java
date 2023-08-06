import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Lottery extends PriorityQueue {
    public static List<Toy> prizes;
    Scanner inputData;


    public int inputToss() {
        System.out.print("Введите целое число: ");
        return Integer.parseInt(inputData.nextLine());
    }

}

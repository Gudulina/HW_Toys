import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Controller {
    static Model model = new Model();
    static ToysLists toys = new ToysLists();
    static Lottery lot = new Lottery();

    void addToy() {
        toys.getAllToys().add(model.createToy());
    }

    static List<Toy> changeToy(int i) {
        toys.getAllToys().set(i, model.createToy());
        return (List<Toy>) toys;
    }


    public void toss() {
        PriorityQueue<Toy> queue = new PriorityQueue<>();
        Toy tossToy;
        List<Toy> tossArray = new ArrayList<>();
        System.out.println(tossArray.size());
        if (ToysLists.getAllToys().size() != 0) {
            int data = Integer.parseInt(Buttons.inputMessage("Введите целое число: "));
            queue.addAll(toys.getAllToys);
            while (queue.size() < data) {
                queue.addAll(toys.getAllToys);
            }
            for (int i = 0; i < ToysLists.getAllToys().size(); i++) {
                tossToy = queue.remove();
                model.showResult(tossToy);
                tossArray.add(tossToy);
            }
            model.writeToFile("Results", tossArray);
        } else
            System.out.println("Выигрышей нет.");
    }
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ToysLists {

    public static List<Toy> allToys;
    public Collection<? extends Toy> getAllToys;

    public ToysLists() {
        this.allToys = new ArrayList<>();
    }

    public List<Toy> toyToList() {
        Toy toy1 = new Toy(0, "мяч", 2, 7);
        Toy toy2 = new Toy(1, "конструктор", 5, 4);
        allToys.add(toy1);
        allToys.add(toy2);
        return allToys;
    }



    public static List<Toy> getAllToys() {
        return allToys;
    }


    }


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Model {
    Toy createToy(){
        System.out.println("\nНовые параметры игрушки:\n");
        int id = Integer.parseInt(Buttons.inputMessage("Введите id игрушки: "));
        String name = Buttons.inputMessage("Введите название игрушки: ");
        int weight = Integer.parseInt(Buttons.inputMessage("Введите вес игрушки: "));
        int volume = Integer.parseInt(Buttons.inputMessage("Введите количество игрушек " + name+": "));
        return (new Toy(id, name, weight, volume));
    }

    public void writeToFile(String data, List<Toy> toysList) {
        try (FileWriter writer = new FileWriter(data, false)) {
            for (Toy toy : toysList) {
                writer.append(String.format("%s  ", toy.getId()));
                writer.append(String.format("%s  ", toy.getName()));
                writer.append(String.format("%s  ", toy.getWeight()));
                writer.append("\n");
                writer.flush();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void showResult(Toy toy) {
        System.out.print("\nВаш выигрыш: ");
        System.out.println(toy);
    }

}

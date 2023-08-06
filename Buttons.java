import java.util.Scanner;
public class Buttons {

    public static String inputMessage(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    public static void menu(){
        Controller cont = new Controller();
        String point;
        while (true){
            point = inputMessage("""

                     1 - Добавьте игрушку
                     2 - Изменить вес игрушки
                     3 - Участвовать в розыгрыше
                     4 - Выход
                    Выберите пункт меню:\s""");
            if (point.equals("4")){
                return;
            }
            try {
                switch (point){
                    case "1" -> cont.addToy();
                    case "2" -> buttonChangeToy();
                    case "3" -> cont.toss();

                    default -> System.out.println("\n Команда не найдена!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }


    static void buttonChangeToy(){
        System.out.println("\nСписок игрушек:\n");
        System.out.println(ToysLists.getAllToys());
        String point;
        while (true){
            point = Buttons.inputMessage("Выберите id игрушки, вес которой надо изменить, или нажмите цифру 0 для выхода: ");
            if (point.equals("0")){
                return;
            }
            try {
                switch (point){
                    case "1" -> Controller.changeToy(1);
                    case "2" -> Controller.changeToy(2);

                    default -> System.out.println("\n Команда не найдена!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

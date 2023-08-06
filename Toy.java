public class Toy extends ToysLists {
    private int id;
    private String name;
    private static int weight; // частота выпадения игрушки (вес в % от 100)
    private int volume; // количество
    public Toy(int id, String name, int weight, int volume) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.volume = volume;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public static int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Игрушка{" +
                "id=" + id +
                ", Наименование: " + name +
                ", кол-во: " + volume +
                ", вес: " + weight +
                '}'+"\n";
    }

    public int compareTo(Toy o) {
        return o.getWeight() - this.getWeight();
    }



}

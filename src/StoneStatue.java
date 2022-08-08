public class StoneStatue extends Statue {

    private final Integer density = 1000;

    public StoneStatue(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "StoneStatue{" +
                "density=" + density +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

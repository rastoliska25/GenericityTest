public class WoodenStatue extends Statue {
    private final String woodType = "Redwood";

    public WoodenStatue(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "WoodenStatue{" +
                "woodType='" + woodType + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

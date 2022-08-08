public class MetalStatue extends Statue {

    private final Integer meltingPoint = 1400;

    public MetalStatue(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MetalStatue{" +
                "meltingPoint=" + meltingPoint +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

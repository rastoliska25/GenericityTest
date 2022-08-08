import java.util.*;

public class Main {
    public static void main(String[] args) {

        Statue woodenStatue = new WoodenStatue("StatueOne", 100);
        woodenStatue.subName();

        Printer<Statue> printer = new Printer<>(new WoodenStatue("StatueOne", 100));
        printer.print();

        //Integer test
        List<Integer> values = new ArrayList<>();  // Mutable
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);

        Collections.sort(values);
        Collections.reverse(values);

        for (Integer o : values) {
            System.out.println(o);
        }

        //Statue test
        List<Statue> statues = new ArrayList<>();
        statues.add(new WoodenStatue("StatueOne", 100));
        statues.add(new StoneStatue("StatueTwo", 2500));
        statues.add(new MetalStatue("StatueThree", 3000));

        for (Statue statue : statues) {
            statue.reverseName();
            System.out.println("\n");
        }

        sentence("Hello");
        sentence(100);
        sentence(new MetalStatue("StatueOne", 100));
        sentence(new StoneStatue("StatueTwo", 2500));
        sentence(new MetalStatue("StatueThree", 3000));
    }

    private static <T> void sentence(T sentence) {
        System.out.println(sentence + "!!!");
    }
}
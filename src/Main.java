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

        sentence("Hello", new WoodenStatue("StatueOne", 100));
        sentence(100, new StoneStatue("StatueTwo", 2500));
        sentence(new WoodenStatue("StatueOne", 100), new MetalStatue("StatueTwo", 1000));
        sentence(new StoneStatue("StatueTwo", 2500), "statueTest");
        sentence(new MetalStatue("StatueThree", 3000), new Random().nextInt(1, 1000));

        //wildCard test
        WildCard wildCard = new WildCard();
        List<Integer> listOfIntegers = new ArrayList<>();
        List<Statue> listOfStatues = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listOfIntegers.add(new Random().nextInt(1, 1000));
            listOfStatues.add(new WoodenStatue("wildStatue " + new Random().nextInt(1, 10), new Random().nextInt(1, 1000)));
        }
        wildCard.printList(listOfIntegers);
        wildCard.printList(listOfStatues);
    }

    private static <T, V> void sentence(T sentence, V secondSentence) {
        System.out.println(sentence + " and " + secondSentence + "!!!!!!");
    }
}
public class Statue <T>{

    String name;
    int weight;

    void subName() {
        System.out.println(name.substring(0, 3));
    }

    void reverseName() {
        char[] reverse = name.toCharArray();
        for (int i = reverse.length - 1; i >= 0; i--) {
            System.out.print(reverse[i]);
        }
    }
}

package _1_behavioral_pattern._3_iterator;

public class IteratorPatternExample {

    public static void main(String[] args) {
        var history = new BrowseHistory();

        history.push("a");
        history.push("b");
        history.push("c");

        Iterator<String> iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }

    }
}

package behavioralPatterns.iterator;

public class SolutionDemo {

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

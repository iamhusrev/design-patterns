package _1_behavioral_patterns._7_observer_pattern;

public class Chart implements Observer {
    private final DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got notified:" + dataSource.getValue());
    }
}

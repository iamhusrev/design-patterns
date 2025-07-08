package _1_behavioral_pattern._7_observer_pattern;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got notified:" + dataSource.getValue());
    }
}

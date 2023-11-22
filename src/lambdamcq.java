import java.util.Arrays;
import java.util.List;
class CricketPlayer {
    private String name;
    private int runs;
    private int centuries;

    public CricketPlayer(String name, int runs, int centuries) {
        this.name = name;
        this.runs = runs;
        this.centuries = centuries;
    }

    public String getName() {
        return name;
    }
    public int getRuns() {
        return runs;
    }
    public int getCenturies() {
        return centuries;
    }

    @Override
    public String toString() {
        return "CricketPlayer{" +
                "name='" + name + '\'' +
                ", runs=" + runs +
                ", centuries=" + centuries +
                '}';
    }
}

class lambdamcq{
    public static void main(String[] args) {
        List<CricketPlayer> players = Arrays.asList(
                new CricketPlayer("Virat Kohli", 12000, 70),
                new CricketPlayer("Rohit Sharma", 9000, 29),
                new CricketPlayer("Steve Smith", 8500, 27),
                new CricketPlayer("Kane Williamson", 8000, 23),
                new CricketPlayer("Joe Root", 8500, 20)
        );

        // Using Lambda Expression to filter players with more than 8000 runs
        players.stream().filter(player -> player.getRuns() > 8000).forEach(System.out::println);
    }
}

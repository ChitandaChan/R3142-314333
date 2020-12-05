import java.util.Objects;

public class Ball {
    private String name;
    private int count;
    public Ball(String name){
        this.name=name;
        count =  Count.getBomszKorotishkacount();
    }
    public void Fly() {
        System.out.println(" мяч летит");
    }
    public void Punch() {
        System.out.println("Удар пришелся по другому глазу");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "мяч{" +
                "имя='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Objects.equals(name, ball.name);
    }

    @Override
    public int hashCode() {
        return (count<<2)*(count<<2);
    }
}


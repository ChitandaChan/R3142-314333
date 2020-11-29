import java.util.Objects;

public class BallFlyMan implements ShotMan {
    private String name;
    public int count;
    public BallFlyMan(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void shootong() {
        System.out.println(getName()+" кидает мяч");
    }

    @Override
    public String toString() {
        return "BallFlyMan{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallFlyMan that = (BallFlyMan) o;
        return count == that.count &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }
}

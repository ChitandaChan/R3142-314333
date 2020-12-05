import java.util.Objects;

public class BallFlyMan implements ShotMan {
    private String name;
    public int count;
    public BallFlyMan(String name) {
        this.name=name; count =  Count.getBomszKorotishkacount();
    }
    public String getName() {
        return name;
    }
    public void shootong() {
        System.out.print(getName()+" кидает мяч");
    }
    public  void PowerShooting() {System.out.println(" с такой силой ");}

    @Override
    public String toString() {
        return "Кидающий мяч{" +
                "имя='" + name + '\'' +
                ", счетчик=" + count +
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
        return (count<<2)*(count<<2)+(count<<2)*(count<<2);
    }
}

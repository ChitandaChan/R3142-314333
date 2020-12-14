import java.util.Objects;

public class Mesto {
    public String Pozition;
    public int count;
    public Mesto(String Pozition) {
     this.Pozition=Pozition;
    }
    public String mestnost() {
        return Pozition;
    }
    public void input() {
        System.out.print(" "+mestnost()+" ");
    }
    @Override
    public String toString() {
        return "Mesto{" +
                "Pozition='" + Pozition + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesto mesto = (Mesto) o;
        return count == mesto.count &&
                Objects.equals(Pozition, mesto.Pozition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Pozition, count);
    }
}

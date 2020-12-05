import java.util.Objects;

public class Mesto {
    public String Pozition;
    private int count;
    public Mesto(String Pozition) {
     this.Pozition=Pozition; count = Count.BomszKorotishkacount;
    }
    public String mestnost() {
        return Pozition;
    }

    @Override
    public String toString() {
        return "Место{" +
                "Позиция='" + Pozition + '\'' +
                ", счетчик=" + count +
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
         return (count<<2)*(count<<2)-5;
    }
}

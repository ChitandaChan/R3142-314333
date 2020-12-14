import java.util.Objects;

public class Balagan {
    public String open, name;
    public Balagan(String open, String name) {
        this.open=open;
        this.name=name;
    }
    public String Open() {
        return open;
    }
    public  String getName() {
        return name;
    }
    public void OPEN() {
        if (Open()=="Закрыт") {
            System.out.print(getName() + " скоро откроется ");
        } else {
            System.out.println(getName() + Open());
        }
    }

    @Override
    public String toString() {
        return "Balagan{" +
                "open='" + open + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Balagan balagan = (Balagan) o;
        return Objects.equals(open, balagan.open) &&
                Objects.equals(name, balagan.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(open, name);
    }
}

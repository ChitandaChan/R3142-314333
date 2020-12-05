import java.util.Objects;

public class Balagan {
    public String open, name;
    private int count;
    public Balagan(String open, String name) {
        this.open=open;
        this.name=name;
        count =  Count.getCountWorkKorotishka();
    }
    public String Open() {
        return open;
    }
    public  String getName() {
        return name;
    }
    public void OPEN() {
        if (Open()=="Закрыт") {
            System.out.print(getName() + " скоро откроется. Можно будет попытаться подзаработать там. ");
            System.out.println("");
        } else {
            System.out.println(getName() + Open());
        }
    }

    @Override
    public String toString() {
        return "Балаганчик{" +
                "открыт='" + open + '\'' +
                ", имя='" + name + '\'' +
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

        return (count<<2)*(count<<2)-1;
    }
}

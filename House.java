import java.util.Objects;

public class House {
    public String name;
    public String color;
    public int count;
    public House(String name, String color) {
        this.name=name;
        this.color=color;
        count =  Count.getCountWorkKorotishka();
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        
        return color;
    }

    @Override
    public String toString() {
        return "Дом{" +
                "имя='" + name + '\'' +
                ", цвет='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(name, house.name) &&
                Objects.equals(color, house.color);
    }

    @Override
    public int hashCode() {
        return (count<<2)*(count<<2)*2;
    }
}

import java.util.Objects;

public class Nothing {
    private String name;
    private int count;
    public  Nothing(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public  void Attention(){
       System.out.println("Не обращать внимание на "+getName());
       count = Count.getCountWorkKorotishka();
    }

    @Override
    public String
    toString() {
        return "Пустяк{" +
                "имя='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nothing nothing = (Nothing) o;
        return Objects.equals(name, nothing.name);
    }

    @Override
    public int hashCode() {
        return (count<<2)*(count<<2)+3+ (count<<2)*(count<<2);
    }
}

import java.util.Objects;

public class Search {
    private String search;
    private String succes;
    private int count;
    public  Search(String search, String succes) {
        this.search=search;
        this.succes=succes;
        count = Count.getCountWorkKorotishka();
    }
    public  void completed() {
        System.out.println(getSearch()+" " + getSucces());
    }
    public String getSucces() {
        return succes;
    }

    public String getSearch() {
        return search;
    }

    @Override
    public String
    toString() {
        return "Поиск{" +
                "искать='" + search + '\'' +
                ", успешность='" + succes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Search search1 = (Search) o;
        return Objects.equals(search, search1.search) &&
                Objects.equals(succes, search1.succes);
    }

    @Override
    public int hashCode() {
        return (count<<2)*(count<<2)-4;
    }
}

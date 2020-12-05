import java.util.Objects;

public class BomzhKorotiska implements Witness, Stand {
    private String name;
    private int eye;
    private Mestoimenie sos;
    private  int count;

    public BomzhKorotiska(String name, int eye, Mestoimenie sos) {
    this.sos=sos;
    this.eye=eye;
    this.name=name;
    count =  Count.getBomszKorotishkacount();
}
    public String getName() {
    return this.name;
    }

    public void setSos(Mestoimenie sos) {
        this.sos = sos;
    }
    public void calculation() {
        System.out.println("Рассчеты "+getName()+ "a оказались верными");
    }

    public Mestoimenie getEnum() {
    return sos;
}
    public void search() {
        switch (sos) {
            case ОНИ:
                System.out.print(getEnum() + " снова отправились искать работу, но в этот день их ");
                break;
            case ОНА:
                System.out.println(getEnum() + " снова отправились искать работу, но в этот день её");
                break;
            case ОН:
                System.out.println(getEnum() + " снова отправились искать работу, но в этот день его");
                break;
            case ОНО:
                System.out.println(getEnum() + " снова отправились искать работу, но в этот день его");
                break;
            case ИМЯ:
                System.out.println(getName() + " снова отправились искать работу, но в этот день "+ getName());
                break;
        }
    }
        public void see () {
            if (this.eye > 0) {
                switch (sos) {
                    case ОНИ:
                        System.out.print(getEnum() + " видят ");
                        break;
                    case ОНА:
                        System.out.print(getEnum() + " видит ");
                        break;
                    case ОН:
                        System.out.print(getEnum() + " видит ");
                        break;
                    case ОНО:
                        System.out.print(getEnum() + " видит ");
                        break;
                    case ИМЯ:
                        System.out.print(getName() + " видит ");
                        break;
                }
            }
            if (this.eye == 0) {
                System.out.println("Ничего не вижу");
            }
        }
    public void Say() {
        switch (sos) {
            case ОНИ:
                System.out.print(getEnum() + "говорят: это ничего,");
                break;
            case ОНА:
                System.out.print(getEnum() + " говорит: это ничего, ");
                break;
            case ОН:
                System.out.print(getEnum() + " говорит: это ничего, ");
                break;
            case ОНО:
                System.out.print(getEnum() + " говорит: это ничего, ");
                break;
            case ИМЯ:
                System.out.print(getName() + " говорит: это ничего, ");
                break;
        }
    }
    public void stay() {
        Mesto mesto = new Mesto(" улицу,где было знакомое увеселительное заведение");
        switch (sos) {
            case ОНИ:
                System.out.println(getEnum() + " явились" + mesto.mestnost());
                break;
            case ОНА:
                System.out.println(getEnum() + " явились" + mesto.mestnost());
                break;
            case ОН:
                System.out.println(getEnum() + " явились" + mesto.mestnost());
                break;
            case ОНО:
                System.out.println(getEnum() + " явились" + mesto.mestnost());
                break;
            case ИМЯ:
                System.out.println(getName() + " явились" + mesto.mestnost());
                break;
        }
    }
    public  void smile() {
        Money dengi = new Money();
        switch (sos) {
            case ОНИ:
                System.out.print(getEnum() + " обрадовались, ");
                break;
            case ОНА:
                System.out.print(getEnum() + " обрадовалась, ");
                break;
            case ОН:
                System.out.print(getEnum() + " обрадовался, ");
                break;
            case ОНО:
                System.out.print(getEnum() + " обрадовался, ");
                break;
            case ИМЯ:
                System.out.print(getName() + " обрадовался, ");
                break;
        }

        dengi.Up();
    }
    public void sad() {
        WorkKorotishka Korotiska;
        Korotiska = new WorkKorotishka("коротышку", 0, Time.вчерашний );
        switch (sos) {
            case ОНИ:
                System.out.print(getEnum() + " пожалели, "+ Korotiska.getName());
                break;
            case ОНА:
                System.out.print(getEnum() + " пожалела, "+ Korotiska.getName());
                break;
            case ОН:
                System.out.print(getEnum() + " пожалел, "+ Korotiska.getName());
                break;
            case ОНО:
                System.out.print(getEnum() + " пожалело, "+ Korotiska.getName());
                break;
            case ИМЯ:
                System.out.println(getName() + "у было жалко, "+ Korotiska.getName());
                break;
        }
        }
    public  void seek() {
     Search search= new Search("поиски", "не увенчались успехом");
     search.completed();
    }

    @Override
    public String toString() {
        return "БомжКоротышка{" +
                "имя='" + name + '\'' +
                ", глаз=" + eye +
                ", местоимение=" + sos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BomzhKorotiska that = (BomzhKorotiska) o;
        return eye == that.eye &&
                count == that.count &&
                Objects.equals(name, that.name) &&
                sos == that.sos;
    }

    @Override
    public int hashCode() {
        return (eye<<1)+(count<<2);
    }
}

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

    public Mestoimenie getSos() {
        return sos;
    }

    public Mestoimenie getEnum() {
    return sos;
}
    public void search() {
        switch (sos) {
            case ОНИ:
                System.out.println(getEnum() + " Искали сегодня работу");
                break;
            case ОНА:
                System.out.println(getEnum() + " Искалa сегодня работу");
                break;
            case ОН:
                System.out.println(getEnum() + " Искал сегодня работу");
                break;
            case ОНО:
                System.out.println(getEnum() + " Искалo сегодня работу");
                break;
            case ИМЯ:
                System.out.println(getName() + " Искал сегодня работу");
                break;
        }
    }
        public void Go () {
            switch (sos) {
                case ОНИ:
                    System.out.println(getEnum() + " идут");
                    break;
                case ОНА:
                    System.out.println(getEnum() + " идет сегодня работу");
                    break;
                case ОН:
                    System.out.println(getEnum() + " идет сегодня работу");
                    break;
                case ОНО:
                    System.out.println(getEnum() + " идет сегодня работу");
                    break;
                case ИМЯ:
                    System.out.println(getName() + " идет сегодня работу");
                    break;
            }
        }
        public void see () {
            if (this.eye > 0) {
                switch (sos) {
                    case ОНИ:
                        System.out.println(getEnum() + " видят коротышку");
                        break;
                    case ОНА:
                        System.out.println(getEnum() + " видит коротышку");
                        break;
                    case ОН:
                        System.out.println(getEnum() + " видит коротышку");
                        break;
                    case ОНО:
                        System.out.println(getEnum() + " видит коротышку");
                        break;
                    case ИМЯ:
                        System.out.println(getName() + " видит коротышку");
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
        Mesto mesto = new Mesto(" знакомое увеселительное здание");
        switch (sos) {
            case ОНИ:
                System.out.println(getEnum() + " стоят около" + mesto.mestnost());
                break;
            case ОНА:
                System.out.println(getEnum() + " стоит около" + mesto.mestnost());
                break;
            case ОН:
                System.out.println(getEnum() + " стоит около" + mesto.mestnost());
                break;
            case ОНО:
                System.out.println(getEnum() + " стоит около" + mesto.mestnost());
                break;
            case ИМЯ:
                System.out.println(getName() + " стоит около" + mesto.mestnost());
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

    @Override
    public String toString() {
        return "BomzhKorotiska{" +
                "name='" + name + '\'' +
                ", eye=" + eye +
                ", sos=" + sos +
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

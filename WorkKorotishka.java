import java.util.Objects;

public class WorkKorotishka implements DodgeMan, Witness, Stand {
    private String name;
    private int eye;
    private int count;
    public WorkKorotishka(String name, int eye) {
        this.eye=eye;
        this.name=name;
        count = Count.getCountWorkKorotishka();
    }
    public String getName() {
        return this.name;
    }

    public int getEye() {
        return eye;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }

    public void see () {
        if (this.eye > 0) {
            System.out.println(getName()+" видит мяч");
        }
        if (this.eye == 0) {
            System.out.println(getName()+" ничего не видит");
        }
    }
    public void dodge() {
        System.out.println(getName()+" Увернулся");
    }
    public void nododge() {
       System.out.println(getName()+" не успел увернуться");
    }
    public void stay() {
        Mesto mesto = new Mesto("Помостье");
        mesto.mestnost();
        System.out.println(getName()+" стоит на " + mesto.mestnost());
    }
    public void cry() {
        System.out.println(getName()+" дико плачет");
    }
    public void Run() {
        System.out.println(getName()+" убегает");
    }
    public void Zenki() {
        Fingal oko =new Fingal(this.eye);
        oko.Fingal();

    }

    @Override
    public String toString() {
        return "WorkKorotishka{" +
                "name='" + name + '\'' +
                ", eye=" + eye +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkKorotishka that = (WorkKorotishka) o;
        return eye == that.eye &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return (eye<<1)+(count<<2);
    }
}

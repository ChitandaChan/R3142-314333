import java.util.Objects;

public class WorkKorotishka implements DodgeMan, Witness, Stand {
    private String name;
    private int eye;
    private int count;
    private Time time;

    public WorkKorotishka(String name, int eye, Time time) {
        this.eye = eye;
        this.name = name;
        this.time = time;
        count = Count.getCountWorkKorotishka();
    }
    public String getName() {
        return this.name;
    }
    public Time getTime()  {return time;}
    public int getEye() {
        return eye;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }
    public void dodge() {
System.out.println(getName()+ "уворачивается");
    }

    public void see () {
        if (this.eye > 0) {
            System.out.println(getName()+" видит мяч");
        }
        if (this.eye == 0) {
            System.out.print(getName()+" невзвидя света");
        }
    }
    public void Sostoyanie() {
        System.out.print(getTime()+" "+ getName());
    }
    public static void dodge(WorkKorotishka workKorotishka) {
        System.out.println(workKorotishka.getName()+" Увернулся");
    }
    public void nododge() {
       System.out.println(getName()+" не успел увернуться");
    }
    public void stay() {
        Mesto mesto = new Mesto("помостье");
        mesto.mestnost();
        System.out.print(" стоит на " + mesto.mestnost());
    }
    public void cry() {
        System.out.println(" заливается слезами от боли");
    }
    public void Run() {
        Balagan home =new Balagan(" открыто", "домой");
        System.out.println(" побежал поскорее "+ home.getName());
    }
    public void Zenki() {
        Fingal oko =new Fingal(this.eye, "подбитый");
        oko.Fingal();
    }
    public void health() {
        System.out.print(" выздоровел и уже ");
    }
    public  void DODGE() {
        Ball ball =new Ball("мячей");
        System.out.println(" увертываясь от летевших в лицо "+ball.getName());
    }
    public void attention(){
        Nothing nothing=new Nothing(" подобные пустяки");
        System.out.print(getName()+" по-видимому привык ");
        nothing.Attention();
    }
    public void Hand() {
        Fingal oko =new Fingal(this.eye, "подбитый");
        System.out.print(getName()+ " схватился рукой за " +oko.glaz());
    }
    @Override
    public String toString() {
        return "Рабочий коротышка{" +
                "имя='" + name + '\'' +
                ", глаз=" + eye +
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

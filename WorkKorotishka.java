import java.util.Objects;

public class WorkKorotishka implements DodgeMan, Witness, Stand {
    public String name;
    private int eye;
    private int count;
    public Time time;
    private Boolean health;
    private Boolean state;
    public WorkKorotishka(String name, int eye, Time time, Boolean health, Boolean state) {
        this.eye=eye;
        this.name=name;
        this.time=time;
        this.health=health;
        count = Count.getCountWorkKorotishka();
    }
    public String getName() {
        return this.name;
    }
    public Time getTime() { return  this.time;}
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
            System.out.println(getName()+" невзвидет света");
        }
    }
    public void dodge() {
        System.out.print(getName()+" уворачивается от ");
    }
    public void nododge() {
       System.out.println(getName()+" не успел увернуться");
    }
    public void stay() {
        System.out.print(getTime()+" "+getName()+" "+hp()+"и уже стоит на ");
    }
    public void cry(String cause ) {
        System.out.println(" заливаясь слезами от "+ cause);
    }
    public void run(String place, String state) {
        System.out.println(getName()+" побежал"+" "+ state+ " "+ place);
    }
    public void zenki() {
        Fingal oko =new Fingal(this.eye);
        oko.sost("большой синяк");

    }
    public  void input() {
        System.out.println(" "+getName());
    }
    public String hp() {
        if (health == true) {
            return " выздоровел ";
        } else {
            return" не выздоровел ";
        }
    }
    public void grabHand(String place) {
        System.out.print("схватившись рукой за "+ place);
    }
    public void attention(Boolean chance) {
        if (chance == true) {
            System.out.print(getName() + " привык обращать внимание на ");
        } else {
            System.out.print(getName() + " привык не обращать внимание на ");
        }
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

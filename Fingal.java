import java.util.Objects;

public class Fingal {
    public int glaz;
    private int count;
    public String conition;
    public Fingal(int glaz, String condition) {
        this.glaz=glaz;
        this.conition=condition;
        count =  Count.getCountWorkKorotishka();
    }
    public String buetiful() {
        return " у него красовался ";
    }
    public void Fingal() {
        if (glaz==1) {
            System.out.println(" Под глазом"+buetiful()+ "Большой синяк");
        }
        if (glaz==0) {
            System.out.println("Большие синяки под глазами");
        }
        if (glaz==2) {
            System.out.println("нет синяков");
        }

    }
   public String glaz() {
        return conition + " глаз";
   }
    @Override
    public String toString() {
        return "FФингал{" +
                "глаз=" + glaz +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fingal fingal = (Fingal) o;
        return glaz == fingal.glaz;
    }

    @Override
    public int hashCode() {
        return (count<<2)*(count<<2)+(glaz<<1);
    }
}

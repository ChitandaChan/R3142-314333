import java.util.Objects;

public class Fingal {
    public int glaz;
    public Fingal(int glaz) {
        this.glaz=glaz;
    }
    public void Fingal() {
        if (glaz==1) {
            System.out.println("Синяк под 1 глазом");
        }
        if (glaz==0) {
            System.out.println("Синяки под глазами");
        }
        if (glaz==2) {
            System.out.println("нет синяков");
        }
    }

    @Override
    public String toString() {
        return "Fingal{" +
                "glaz=" + glaz +
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
        return Objects.hash(glaz);
    }
}

public class Ball {
    public void Fly(String target) {
        System.out.println(" мяч летит в "+ target);
    }
    public void Punch() {
        System.out.println("Мяч попадает в цель");
    }
    public  String getBall() {
        return  " мяч";
    }
    public void input() {
        System.out.println(getBall());
    }
}

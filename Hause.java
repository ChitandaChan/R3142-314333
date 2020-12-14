public class Hause {
    private  String Name;
    private Pozition pozition;
    public Hause(String Name, Pozition pozition){
        this.Name=Name;
        this.pozition=pozition;
    }

    public String getName() {
        return Name;
    }

    public Pozition getEnum() {
        return pozition;
    }
    public  void location() {
        System.out.println(getEnum()+"  "+ getName());
    }
}

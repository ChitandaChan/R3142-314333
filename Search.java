public class Search {
    private String Name;
    private  String Sost;
    public  Search(String Name, String Sost) {
        this.Name=Name;
        this.Sost=Sost;
    }

    public String getName() {
        return Name;
    }

    public String getSost() {
        return Sost;
    }
    public  void search() {
        System.out.println(" "+getName() + " "+ getSost());
    }
}

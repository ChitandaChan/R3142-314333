public class Money {
    private String Place;
    private  String Name;
    public Money(String Place, String Name) {
        this.Place=Place;
        this.Name=Name;
    }

    public String getPlace() {
        return Place;
    }

    public String getName() {
        return Name;
    }
    public void Up() {
        System.out.println(" можно попытаться подзаработать "+ getPlace());
    }
    public void Down() {
        System.out.println(" можно попытаться потратить" + getPlace());
    }
    public  void earn() {
        System.out.print("сможет заработать "+getName());
    }
}

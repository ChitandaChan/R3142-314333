public class Problem {
    private  Boolean state;
    public  Problem(Boolean state){
        this.state=state;
    }

    public String getState() {
        if (state==true) {
            return "проблемы";
        } else {
            return "пустяки";
        }
    }
    public  void fullState(String definition) {
        System.out.println(definition+ " "+ getState()+" ");
    }
}

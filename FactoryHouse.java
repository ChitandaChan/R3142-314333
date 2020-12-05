import java.util.Arrays;

public class FactoryHouse {
    private int count;
    String[] ff = new String[] {"черного","белого","красного","синего"};
   public void Generations() {
       System.out.print("Улица состоит из :") ;
       for (int i = 0; i < 4; i++){
           System.out.print(new House("zdanie" + i,ff[i]).getColor() + " ");
       }
       System.out.println(" домов");
    }
}

import java.util.*;

public class Deneme {


    public static void main(String args[]){
        try {
            Asus computer1 = (Asus) ComputerFactory.createComputer(Asus.class);
            computer1.since(1234);
            computer1.name();

            Mac computer2 = (Mac) ComputerFactory.createComputer(Mac.class);
            computer2.name();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

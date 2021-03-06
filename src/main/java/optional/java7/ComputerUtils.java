package optional.java7;

import java.util.Optional;

public class ComputerUtils {
    private ComputerUtils() {
        throw new UnsupportedOperationException("This  class shouldn't be instantiated "); // sprecyzowana
    }
    public static String getGraphicsCardModelFirstApproach(Computer computer) {  // to rozwiazanie nie jest bezpieczne bo nie zabespiecza przed NPE - w przypadku gdy na ktoryms etapie pojawi sie null
       // return computer.getGraphicCard().getModel();
        return   computer           //Computer
                .getGraphicCard()   //GraphicCard
                .getModel();        //String
    }
    public static String getGraphicsCardModelGoodApproach(Computer computer){

        String result = null;
        if(computer != null){
            GraphicsCard graphicsCard = computer.getGraphicCard();
         if(graphicsCard != null) {
             result = graphicsCard.getModel();
             System.out.println(result);
             return result ; //= graphicsCard.getModel();
         }

        }
        return result;
    }
    public static String getGCModelWithJava8(Computer computer) {
        return Optional.ofNullable(computer)
                .map(comp -> comp.getGraphicCard())
                .map(graphicsCard -> graphicsCard.getModel())
                .orElse("no model");                         // zamienimy computer na karte graficzna lub zamieni na optional.empty()
    }
    public static void main(String[] args) {

        Computer withoutGraphicsCard = new Computer(null);
        Computer withUnknownModel = new Computer(new GraphicsCard(null));
        Computer personalComputer = new Computer(new GraphicsCard("nVidia"));

//1*
     /*   getGraphicsCardModelFirstApproach(withoutGraphicsCard);
        getGraphicsCardModelFirstApproach(withUnknownModel);
        getGraphicsCardModelFirstApproach(personalComputer);
        getGraphicsCardModelFirstApproach(null);  */

//2*
        getGraphicsCardModelGoodApproach(withoutGraphicsCard);
        getGraphicsCardModelGoodApproach(withUnknownModel);
        getGraphicsCardModelGoodApproach(personalComputer);
        getGraphicsCardModelGoodApproach(null);
    }
}


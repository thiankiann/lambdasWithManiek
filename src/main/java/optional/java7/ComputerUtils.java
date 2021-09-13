package optional.java7;

import java.util.Optional;

public class ComputerUtils {
    private ComputerUtils() {
        throw new UnsupportedOperationException("This  class shouldn't be instantiated "); // sprecyzowana
    }
    public static String getGraphicsCardModelFirstApproach(Computer computer) {
        return computer.getGraphicCard().getModel();
    }
    public static String getGraphicsCardModelGoodApproach(Computer computer){
       // secretLen= mySecret.getMySecret() != null ? mySecret.getMySecret().length() : 0;
       // return computer.getGraphicCard().getModel() != null ? computer.getGraphicCard().getModel() : ;
     /*   Optional opt = Optional.ofNullable(computer.getGraphicCard().getModel());

        Optional unpacked = opt;
        return unpacked = opt.orElse(null);  */
        /*if (computer.getGraphicCard() == null ) {
            return null;
        } else if (computer.getGraphicCard().getModel() == null){
            return null;
        }else
           return computer.getGraphicCard().getModel();*/

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


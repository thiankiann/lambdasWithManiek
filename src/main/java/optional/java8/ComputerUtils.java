package optional.java8;

public class ComputerUtils {
    private ComputerUtils() {
        throw new UnsupportedOperationException("This  class shouldn't be instantiated "); // sprecyzowana
    }

    public static String getGraphicsCardModelGoodApproach(Computer computer){

    }
    public static void main(String[] args) {

        Computer withoutGraphicsCard = new Computer(null);
        Computer withUnknownModel = new Computer(new GraphicsCard(null));
        Computer personalComputer = new Computer(new GraphicsCard("nVidia"));


        getGraphicsCardModelGoodApproach(withoutGraphicsCard);
        getGraphicsCardModelGoodApproach(withUnknownModel);
        getGraphicsCardModelGoodApproach(personalComputer);
        getGraphicsCardModelGoodApproach(null);
    }
}


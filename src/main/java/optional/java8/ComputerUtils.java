package optional.java8;

import java.util.Optional;

public class ComputerUtils {
    private ComputerUtils() {
        throw new UnsupportedOperationException("This  class shouldn't be instantiated "); // sprecyzowana
    }

    public static String getGraphicsCardModelGoodApproach(Computer computer){   // zastosowalismy tu flatmapy aby ne miec pudelka w pudelku (optional w optionalu)
        return Optional.ofNullable(computer)
                .flatMap(comp -> comp.getGraphicCard())    // dostalibysmy tutaj z getgrphicCard() Optionala + map zapakowalby to w nastepnego optionala i mielibysmy tu Optional<Optional<GraphicsCard>>
                .flatMap(graphicsCard -> graphicsCard.getModel())
                .orElse("no model");
    }
    public static void main(String[] args) {

        Computer withoutGraphicsCard = new Computer(null);
        Computer withUnknownModel = new Computer(new GraphicsCard(null));
        Computer personalComputer = new Computer(new GraphicsCard("nVidia"));


        System.out.println( getGraphicsCardModelGoodApproach(withoutGraphicsCard));
        System.out.println( getGraphicsCardModelGoodApproach(withUnknownModel));
        System.out.println( getGraphicsCardModelGoodApproach(personalComputer));
        System.out.println( getGraphicsCardModelGoodApproach(null));
    }
}


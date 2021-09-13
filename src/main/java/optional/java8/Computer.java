package optional.java8;

import java.util.Optional;

public class Computer {
    private GraphicsCard graphicsCard;

    public Computer(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public Optional<GraphicsCard> getGraphicCard() {
        return Optional.ofNullable(graphicsCard);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "graphicCard=" + graphicsCard +
                '}';
    }
}

package optional.java7;

public class Computer {
    private GraphicsCard graphicsCard;

    public Computer(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
    public GraphicsCard getGraphicCard() {
        return graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "graphicCard=" + graphicsCard +
                '}';
    }
}

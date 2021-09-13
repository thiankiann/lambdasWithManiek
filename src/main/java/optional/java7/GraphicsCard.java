package optional.java7;

public class GraphicsCard {
    private String model;

    public GraphicsCard(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "model='" + model + '\'' +
                '}';
    }
}

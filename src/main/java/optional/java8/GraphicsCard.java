package optional.java8;

import java.util.Optional;

public class GraphicsCard {
    private String model;

    public GraphicsCard(String model) {
        this.model = model;
    }

    public Optional<String> getModel() {
        return Optional.ofNullable(model);
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "model='" + model + '\'' +
                '}';
    }
}

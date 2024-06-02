package structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShapeFactory {

    private static Map<String, Shape> shapes = new HashMap<>();


    public static Shape getShape(String type) {

        Shape shape = null;
        if (Objects.nonNull(shapes.get(type))) {
            shape = shapes.get(type);
        } else {
            if (type.equalsIgnoreCase("circle")) {
                shape = new Circle();
            } else {
                shape = new Rectangle();
            }

            shapes.put(type, shape);
        }
        return shape;
    }


}

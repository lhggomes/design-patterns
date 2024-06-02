package structural.flyweight.methods;

public class Rectangle extends Shape {

    private String label;


    public Rectangle() {

        label = "Rectangle";

    }

    @Override
    public void draw(int lenght, int breadth, String fillStyle){
        toString();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}

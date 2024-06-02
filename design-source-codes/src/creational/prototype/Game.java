package creational.prototype;

public class Game implements Cloneable {

    private int id;
    private String name;

    @Override
    protected Game clone() throws CloneNotSupportedException {
        return (Game) super.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

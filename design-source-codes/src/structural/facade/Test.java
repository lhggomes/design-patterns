package structural.facade;

public class Test {

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        processor.checkStock("Macbook");
    }
}

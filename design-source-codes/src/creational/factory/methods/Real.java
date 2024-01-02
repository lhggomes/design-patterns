package creational.factory.methods;

public class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
}

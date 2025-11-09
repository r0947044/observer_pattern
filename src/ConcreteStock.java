import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConcreteStock implements Stock {
    private final String symbol;
    private double price;
    private final List<Investor> investors = new ArrayList<>();

    public ConcreteStock(String symbol, double initialPrice) {
        this.symbol = Objects.requireNonNull(symbol, "symbol");
        this.price = initialPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    // Changes the price and notifies all subscribed investors
    public void setPrice(double newPrice) {
        if (Double.compare(this.price, newPrice) != 0) {
            this.price = newPrice;
            notifyInvestors();
        }
    }

    @Override
    public void addInvestor(Investor investor) {
        if (investor != null && !investors.contains(investor)) {
            investors.add(investor);
        }
    }

    @Override
    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(symbol, price);
        }
    }
}
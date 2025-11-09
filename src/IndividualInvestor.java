public class IndividualInvestor implements Investor {
    private final String name;

    public IndividualInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("[Individual] " + name + " notified: " + stockSymbol + " new price = " + price);
    }
}
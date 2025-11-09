public class InstitutionalInvestor implements Investor {
    private final String institutionName;

    public InstitutionalInvestor(String institutionName) {
        this.institutionName = institutionName;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("[Institution] " + institutionName + " received update: " + stockSymbol + " @ " + price);
    }
}
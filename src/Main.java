public class Main {
    public static void main(String[] args) {
        ConcreteStock aapl = new ConcreteStock("AAPL", 150.00);

        Investor alice = new IndividualInvestor("Alice");
        Investor bigFund = new InstitutionalInvestor("BigFund Capital");

        aapl.addInvestor(alice);
        aapl.addInvestor(bigFund);

        aapl.setPrice(151.25);
        aapl.setPrice(153.40);

        aapl.removeInvestor(alice);
        aapl.setPrice(149.90);
    }
}
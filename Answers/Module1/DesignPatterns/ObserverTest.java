public class ObserverTest {
    public static void main(String[] args) {
        StockMarket market=new StockMarket();

        Observer mobile=new MobileApp("StockApp");
        Observer web=new WebApp("TradingDashboard");

        market.register(mobile);
        market.register(web);

        market.setPrice("AAPL", 189.50);
        market.setPrice("GOOGL", 142.30);

        market.deregister(mobile);
        market.setPrice("TSLA", 245.00);
    }
}

/**
 * Created by Ivan on 1/12/2017.
 */
public class Stocks {
    private String ticker;
    private double avgCost;
    private double enteredAt;
    private int amount;

    private static int totalStocksOwned = 0;
    private static double totalStocksAmount = 0;


    /**
     * Stocks() is used to store information of a stock
     * @param ticker Ticker of stock
     * @param enteredAt price entered at for the stock
     * @param amount total amount of stock purchased
     */
    public Stocks(String ticker, double enteredAt, int amount) {
        this.ticker = ticker;
        this.enteredAt = enteredAt;
        this.amount = amount;
        this.avgCost = amount * enteredAt;

        // add to total stocks and amount owned
        totalStocksOwned++;
        totalStocksOwned += enteredAt;

    }

    public String getTicker() {
        return ticker;
    }

    public double getAvgCost() {
        return avgCost;
    }

    public int getAmount() {
        return amount;
    }

    /** @return returns amount Invested in stocks*/
    public int getTotalStocks(){ return totalStocksOwned; }

    public int getTotalStocksOwned() {
        return totalStocksOwned;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void buy(int amount){

    }


    private double avg(double x, double y){
        return (x+y) / 2.0;
    }

    public String stockDataAsString() {
        String string = ticker + "|" + avgCost + "|" + amount;
        return string;
    }
}

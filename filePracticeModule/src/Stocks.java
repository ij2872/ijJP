/**
 * Created by Ivan on 1/12/2017.
 */
public class Stocks {
    private String ticker;
    private double avgCost;
    private int amount;

    public Stocks(String ticker, double avgCost, int amount) {
        this.ticker = ticker;
        this.avgCost = avgCost;
        this.amount = amount;
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

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String stockDataAsString(){
        String string = ticker + "|" + avgCost + "|" + amount;
        return string;
    }
}

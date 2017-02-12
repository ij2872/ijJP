import org.jsoup.Jsoup;

import javax.swing.text.Document;

/**
 * Created by Ivan on 2/6/17.
 * Used to return stock information
 */

    // TODO get stock information using Yahoo YQL
public class StockGet {
    private String ticker;
    private double currentCost;


    public StockGet(){
        System.out.println("Enter A Stock with the get() method");
        System.out.println();
    }

//    public void get(String ticker){
//        Document doc = new Jsoup.connect().get();
//    }


    // test
    public static void main(String[] args){
        StockGet stockGetter = new StockGet();

    }

}

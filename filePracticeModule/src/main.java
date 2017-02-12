
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ivan on 1/3/2017.
 */
public class main {
    public static void main(String[] args) {
        DataWrite dw = new DataWrite();
        List<Stocks> stocks = new ArrayList<Stocks>();

        stocks.add(new Stocks("KO", 41.50, 47));
        stocks.add(new Stocks("TSLA", 229.90, 2));
        stocks.add(new Stocks("GAIN", 9.17, 90));

    }
}

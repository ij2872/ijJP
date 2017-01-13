import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.List;

/**
 * Created by Ivan on 1/12/2017.
 */
public class DataWrite {
    private String fileName;

    public DataWrite(String fileName, List<Stocks> data) {
        this.fileName = fileName;


        write(data);
    }

    public void write(List<Stocks> data) {
        try {
            PrintWriter writer = new PrintWriter(fileName);
            
            data.stream()
                    .forEach(e -> writer.println(e.stockDataAsString()));

            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}

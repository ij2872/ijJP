import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.List;

/**
 * Created by Ivan on 1/12/2017.
 */
public class DataWrite {
    private String fileName;
    private boolean isDirEmpty;

    public DataWrite(){
        this.fileName = null;
        this.isDirEmpty = true;
    }

    public DataWrite(String fileName, List<Stocks> data) {
        this.fileName = fileName;


        write(data);
    }

    public void writeStock(List<Stocks> data) {
        if(!isDirEmpty){
            try {
                PrintWriter writer = new PrintWriter(fileName);

                data.stream()
                        .forEach(e -> writer.println(e.stockDataAsString()));

                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            try {
                this.fileName = "stockTest.dat";
                this.isDirEmpty = false;

                PrintWriter writer = new PrintWriter(fileName);

                data.stream()
                        .forEach(e -> writer.println(e.stockDataAsString()));

                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }



    }

}

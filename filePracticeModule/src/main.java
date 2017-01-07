
import java.util.Arrays;
/**
 * Created by Ivan on 1/3/2017.
 */
public class main {
    public static void main(String[] args){

        DataReader_10Q files = new DataReader_10Q();
        files.setDir("/data/amd10Q.txt");
        files.printLine();
    }
}

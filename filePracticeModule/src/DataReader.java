import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ivan on 1/3/2017.
 * Load Files and print content.
 *
 */
public class DataReader {

    //Global Vars
    private boolean isFileDirAvailable = false;
    private String FileDir;
    private String parentDir = "./filePracticeModule";

    private String TEXT;
    private List<String> TEXT_LIST;

    //Initialize Data Reader
    public DataReader(){
        System.out.println("Starting up Data Reader...");
        System.out.println("Use .setDir() to import text");

    }

    // Import files when initializing DataReader
    public DataReader(String fileDir){
        System.out.println("Starting up Data Reader...");
        FileDir = parentDir + fileDir;

        try {
            TEXT = new String(Files.readAllBytes(Paths.get(FileDir)));
            TEXT_LIST = Arrays.asList(TEXT.split("\\PL+"));

            System.out.println("Data Loaded!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Methods

    public void setDir(String fileDir){

        try {
            FileDir = parentDir + fileDir;
            isFileDirAvailable = true;

            TEXT = new String(Files.readAllBytes(Paths.get(parentDir + fileDir)));
            TEXT_LIST = Arrays.asList(TEXT.split("\\PL+"));

            System.out.println("Data Loaded!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Return Directory of File as String
    // Else return error
     public String getDir(){
        if (FileDir != null) {
            return FileDir;
        } else {
            return "Error: no file has been loaded";
        }
    }

    // get content of file
    public String getString(){
        return TEXT;
    }

    public List<String> getWords(){
        return TEXT_LIST;
    }

    public void printWords(){
        Stream.of(TEXT_LIST)
                .forEach(System.out::println);
    }

    public void printLine(){
        Stream.of(TEXT).forEach(System.out::println);
    }

    public long getWordCount(){
        return TEXT_LIST.stream().count();
    }

    public void getWordCount(String wordToSearch){
        long wordCount = TEXT_LIST.stream()
                .filter(w -> w.equals(wordToSearch))
                .count();
        System.out.printf("There are %s, instances of '%s'", wordCount, wordToSearch);
    }


}

/**
 * Created by Ivan on 1/3/2017.
 * Load Files and print content.
 *
 */
public class DataReader {
    //Global Vars
    private boolean isFileDirAvailable = false;
    private String FileDir;


    //Initialize Data Reader
    public DataReader(){
        System.out.println("Starting up Data Reader");

    }

    // - Import files when initializing DataReader
    public DataReader(String fileDir){

    }



    //Methods

    public void setDir(String fileDir){
        FileDir = fileDir;
        isFileDirAvailable = true;
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
    // TODO read files
    public String getString(){
        String content = "";

        return content;
    }




}

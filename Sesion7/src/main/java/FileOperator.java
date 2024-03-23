import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperator {

    public String ReadEntireFile(String path) {
        StringBuilder builder = new StringBuilder();
        try {
            try (FileReader fr = new FileReader(path)) {
                int i;
                while ( (i = fr.read()) != -1){
                    builder.append((char)i);
                }
            }
        }
        catch(IOException ex){
            System.err.println(ex.getMessage());
        }
        return builder.toString();

    }

    void WriteToFile(String path, String content){
        try{
            FileWriter fw = new FileWriter(path);
            fw.write(content);
            fw.close();
        }
        catch(IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}

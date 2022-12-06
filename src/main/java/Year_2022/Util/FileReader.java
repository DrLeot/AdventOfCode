package Year_2022.Util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private final String path;

    public FileReader(final String path){
        this.path = path;
    }

    public ArrayList<String> readAllLines() throws IOException{
        ArrayList<String> lines = new ArrayList<>();
        if(new File(path).exists()) {
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {

                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }

            } catch (IOException ioex) {
                throw new IOException(ioex);
            }
        }else{
            throw new IOException("File not found!");
        }
        return lines;
    }
}

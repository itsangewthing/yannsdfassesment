package assessment.task02.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Repository {
    
    public static class WriteReadUtf8 {
        public static void main(String[] args) throws IOException {
          List<String> answerlist = Arrays.asList("", "", "", "");
      
          Path textFile = Paths.get("task2UTF.txt");
          Files.write(textFile, answerlist, StandardCharsets.UTF_8);
      
          List<String> read = Files.readAllLines(textFile, StandardCharsets.UTF_8);
      
          System.out.println(answerlist.contains("requestID","nameID","email","avgans"));
        }
      }

    public boolean isreadUTF() {
        return false;
    }

    public boolean iswriteUTF() {
        return false;
    }



    
}

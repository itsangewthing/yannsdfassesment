package assessment.task01;

import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;


public class CustomerData{
    
  public static void main(String[] args) throws IOException {
    CSVReader reader = null;


    try {
      reader = new CSVReader (new FileReader("/Users/macbook_1/task01/src/main/java/assessment/task01/Task1SourceFiles/tour_packages.csv"));
      String[] nextLine;
     
      while ((nextLine = reader.readNext()) != null) {
        for (String token: nextLine) {
          System.out.println(token);
        }
        System.out.print("\n");
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  public void run() {
  }
}

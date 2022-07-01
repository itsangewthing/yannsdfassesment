package assessment.task01;

import java.util.List;

import com.opencsv.bean.CsvBindByName;

// /Users/macbook_1/task01/Task1SourceFiles/tour_packages.csv

public class TourPackages {

        // salutations,last_name,package_name,price
     
        private String salutations;
        private String last_name;
        private String package_name;
        private int price;
       
      
        public void Student(String salutations, String last_name, String package_name, int price) {
            super();
        this.salutations = salutations;
        this.last_name = last_name;
        this.package_name = package_name;
        this.price = price;
        }
      
        public String getsalutations() {
            return salutations;
        }
      
      
        public String getlast_name() {
            return last_name;
        }
       

        public void setLastName(String last_name) {
            this.last_name = last_name;
        }
      
        public int getPrice() {
            return price;
        }
        
        public void setPrice(int price) {
            this.price = price;
        }
         
        @Override
        public String toString() {
            return "Tour Package Salutations =" + salutations + ", last_name =" + last_name + ", package_name =" + package_name + ", price ="
                    + price ;
        }


    }
    



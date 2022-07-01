package assessment.task02.server;

//session file

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import org.apache.commons.logging.impl.AvalonLogger;


public class Session implements Runnable  {

    // declaration 
    private Repository repo;
    private Socket sock3t;
  
    private final String SUCCESS = "SUCCESS\r\n";
    private final String FAILED = "FAILED\r\n";
    private final String nameIC = "YANN NGEW";
    private final String Email = "yann.ngew@gmail.com";
    private final String requestID = "1234abcd";
    
    //no.1
    private InputStream is;
    private ObjectInputStream ois;
    private OutputStream os;
    private ObjectOutputStream oos;
    



public Session(Repository repo, Socket sock3t){
        this.repo = repo;
        this.sock3t = sock3t;
      }

 
//no3

public static void main(String[] args) { 
 
    float average = new float("average");

     try (Scanner input = new Scanner(System.in)) {
        float[] arr = new float[10]; 
         //float] arr = {97, 35, 82, 2, 45}; 
         float total = 0; 
         
         for(int i=0; i<arr.length; i++){ 
            arr[i]=input.nextFloat(); 
            total = total + arr[i]; 
         } 
          
         
        for(int i=0; i<arr.length; i++){ 
            System.out.print(arr[i]+"\t"); 
         } 
          
        
         float average = (float) (total / arr.length); 
  
         System.out.format("The average of the list of integers: %.3f", average);
    } 
     } 
    

//no4

private String parseRequestResponse(String request) throws IOException{


    
    String cmd = readUTF()[0];
    String[] readUTF() = request.split(" ");
    String requestID = readUTF()[1];
    String intlist = readUTF()[2];
    String response = " ";
    float writeFloat() = float average;
    




  
    switch (cmd){
        
        case readUTF():
        
        response = parseGetRequest(requestID, intlist);
        break;


        case writeUTF():
        
        response =
        break;


        case writeFloat():
        response = 
        break;

        case readBoolean():
         
        break;

           
        }


        break;

    return response;
    }

    public boolean isAnswerscorrect(Repository repo){
		boolean isCorrect = true;

		if (!repo.iswriteUTF()){
			isCorrect = true;
			System.err.println("request id correct");
		}
		if (!repo.iswriteUTF()){
			isCorrect = true;
			System.err.println("name is correct");
		}
		if (!repo.isreadUTF()){
			isCorrect = true;
			System.err.println("Email is valid. /n");
		}

		return isCorrect;
  }

}
















//close 


private String[] readUTF() {
    return null;
}


private String parseGetRequest(String requestID2, String intlString) {
    return null;
}


private boolean readBoolean() {
    return (Boolean) null;
}


private void initializeStreams(Socket sock3t) throws IOException {
    is = sock3t.getInputStream();
    ois = new ObjectInputStream(is);
    os = sock3t.getOutputStream();
    oos = new ObjectOutputStream(os);
}

private String read() throws IOException {
    return ois.readUTF();
}
private void write(String out) throws IOException {
    oos.writeUTF(out);
    oos.flush();
}

private void close() throws IOException {
    is.close();
    os.close();
}






@Override
    public void run() {
        
        try {
            start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }



    
}

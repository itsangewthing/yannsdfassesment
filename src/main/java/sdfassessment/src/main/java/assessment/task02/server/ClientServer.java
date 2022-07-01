package assessment.task02.server;
//server file

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientServer {
    private Repository repo;
    private Socket sock3t;
    
    private int port = 80;
    private String host ="task02.chuklee.com";

    //UNIQUE HEX STRING
    private final String requestID = "request id:";
    //COMMA SEPERATED LIST OF INTEGERS
    private final String intlistCMD = "list integers";
    //COMMAND FOR BOTH
    private final String readUTF = "readUTF()";

    private final String writeUTF = "writeUTF()";
    private final String writeFloat = "writeFloat()";
    private final String readBoolean = "readBoolean()";

    
    /**
     * commands */
    public ClientServer(String[] args){
        if (args.length > 0){
            
            List<String> argsList = new ArrayList<>(Arrays.asList(args));
            

                if (argsList.contains(requestID)){
                    int indexofrequestIDValue = argsList.indexOf(indexofrequestIDValue) + 1;

                    this.requestID = Integer.parseInt(args[indexofrequestIDValue]);
                
                    } 

                if (argsList.contains(intlistCMD)){
                    int indexofintListCMD = argsList.indexOf(indexofintListCMD) + 1;

                    this.intlistCMD = args[indexofintListCMD];
                    }        

                }
         }
    }



    public void start() {
     try {
            ServerSocket ClientServer = new ServerSocket(port);
            // ExecutorService threadPool = ExecutorService.newFixedThreadPool(2);

            while (true) {
				System.out.println("Connect to %s at port: %d");
				Socket sock3t = server.accept();

				System.out.println("Starting connection..");

				
				Repository repo = new Repository(repoDir);
				Session sess = new Session(repo, sock3t);  
				// threadPool.execute(sess);
			}

    } catch (IOException e) {
			System.err.println("Server error, closing connection");
			e.printStackTrace();
   
   



    }
}

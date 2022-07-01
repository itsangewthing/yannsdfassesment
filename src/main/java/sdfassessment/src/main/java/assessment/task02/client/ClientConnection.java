package assessment.task02.client;

//client file

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientConnection {
    public ClientConnection(String[] args) {
	}

	public static void main(String[] args) {
        private  int port = 80;
	    private String host = "task02.chuklee.com";

        private Socket sock3t;

	    private InputStream is;
	    private ObjectInputStream ois;
	    private OutputStream os;
	    private ObjectOutputStream oos;


        public ClientConnection (String[] args){
            if (args.length > 0){
                String terms[]: args[0].split(" ");
                this.host = terms[0];
                this.port = Integer.parseInt(terms[1]);
            }
        }


        public void start()throws UnknownHostException, IOException{
			
            try{
			System.out.printf("Connecting to %s on port %d...\n", host, port);
			Socket sock3t = new Socket(host, port);
			System.out.println("Connected");
			initializeStreams(sock3t);
			Console cons = System.console();

			String input = cons.readLine(">");
			write(input);

			String response = read();
			System.out.println(response);

			close();
			sock3t.close();
		} catch (IOException ex){
			System.err.println(ex);
			ex.printStackTrace();
		}
	}

 //no.1
    private void initializeStreams(Socket sock3t) throws IOException {
		os = sock3t.getOutputStream();
		oos = new ObjectOutputStream(os);
		is = sock3t.getInputStream();
		ois = new ObjectInputStream(is);
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

        
         

        }

    public void start() {
    }
}

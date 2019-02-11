package hwBasicHTTPServer;

import java.io.IOException;
import java.net.Socket;


public class Main {

	public static void main(String[] args) throws IOException {
		Server thisServer = new Server(8080);
		System.out.println("Server is Listening");
		System.out.println();

		while (true) {
			Socket connectingSocket = thisServer.serverSocket.accept();
			ClientSocket clientSocket = new ClientSocket(connectingSocket);
			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						clientSocket.start();
						clientSocket.socket.close();

					} catch (Exception e) {
						e.printStackTrace();
					}

					System.out.println();
				}
			});
			thread.start();
		}
	}
}

package tpf;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Logger;

public class test {
    public static void main(String[] args) throws IOException {
        int port = 8888;
        ServerSocket serverSocket = new ServerSocket(port);
        Logger logger = Logger.getLogger("T_P_F");
        System.out.println("git test");
        /*
        while(true){
            Socket clientSock = serverSocket.accept();
            SocketAddress clientAddress = clientSock.getRemoteSocketAddress();
        }
        */
    }
}
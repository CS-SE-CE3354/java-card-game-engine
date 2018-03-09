package connections;

import com.esotericsoftware.kryonet.*;

import java.io.IOException;

public class ServerBroker {

    private Client myClient;

    public ServerBroker(int timeout, String ip, int tcp, int udp ) throws IOException {
        myClient = new Client();
        myClient.start();
        myClient.connect(timeout, ip, tcp, udp);

    }

}

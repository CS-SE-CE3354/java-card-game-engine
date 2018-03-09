package connections;

import com.esotericsoftware.kryonet.*;

import java.io.IOException;

public class ServerManager {

    private Server server;

    public ServerManager( int tcp, int udp ) throws IOException {
        server = new Server();
        server.start();
        server.bind( tcp, udp );

        // set up connection processor here

    }
}

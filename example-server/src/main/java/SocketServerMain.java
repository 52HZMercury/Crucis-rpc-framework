import github.javaguide.HelloService;
import github.javaguide.config.RpcServiceConfig;
import github.javaguide.remoting.transport.socket.SocketRpcServer;
import github.javaguide.serviceimpl.HelloServiceImpl;

/**
 *
 */
public class SocketServerMain {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        SocketRpcServer socketRpcServer = new SocketRpcServer();
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();
        rpcServiceConfig.setService(helloService);
        socketRpcServer.registerService(rpcServiceConfig);
        socketRpcServer.start();
    }
}

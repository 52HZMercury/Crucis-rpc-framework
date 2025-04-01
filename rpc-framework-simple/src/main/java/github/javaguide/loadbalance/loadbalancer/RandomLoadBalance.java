package github.javaguide.loadbalance.loadbalancer;

import github.javaguide.loadbalance.AbstractLoadBalance;
import github.javaguide.remoting.dto.RpcRequest;

import java.util.List;
import java.util.Random;

/**
 * Implementation of random load balancing strategy
 * 随机负载均衡策略的实现
 */
public class RandomLoadBalance extends AbstractLoadBalance {

    //
    protected String dodelete(List<String> serviceAddresses, RpcRequest rpcRequest) {
        rpcRequest.getRpcServiceName();
        return serviceAddresses.get(0);
    }

    @Override
    protected String doSelect(List<String> serviceAddresses, RpcRequest rpcRequest) {
        Random random = new Random();
        return serviceAddresses.get(random.nextInt(serviceAddresses.size()));
    }
}

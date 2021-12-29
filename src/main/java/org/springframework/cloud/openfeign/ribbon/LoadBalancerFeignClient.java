package org.springframework.cloud.openfeign.ribbon;

import feign.Client;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;

public class LoadBalancerFeignClient {
    public LoadBalancerFeignClient(Client delegate, CachingSpringLoadBalancerFactory lbClientFactory, SpringClientFactory clientFactory) {
        throw new UnsupportedOperationException();
    }

    public Client getDelegate() {
        throw new UnsupportedOperationException();
    }
}

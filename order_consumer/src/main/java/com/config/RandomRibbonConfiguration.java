package com.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author R
 * @date 2020/4/29 - 15:10
 * 负载均衡
 */
@Configuration
public class RandomRibbonConfiguration {

    @Autowired
    IClientConfig config;

    public IRule ribbonRule(){
        return new RandomRule();
    }
}

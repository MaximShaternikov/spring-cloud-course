//package com.example.gateway.config;//package gatewayservice.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.gateway.filter.GatewayFilter;
//import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CustomGatewayFilterFactory extends AbstractGatewayFilterFactory<Object> {
//    private final Filter filter;
//
//    @Autowired
//    public CustomGatewayFilterFactory(Filter filter) {
//        this.filter = filter;
//    }
//
//    @Override
//    public GatewayFilter apply(Object config) {
//        return filter;
//    }
//}
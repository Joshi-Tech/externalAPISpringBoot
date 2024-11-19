package com.retail.cart;

import com.retail.cart.entity.ReqResGetPojo;
import com.retail.cart.services.ReqResServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ReqResApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReqResApplication.class, args);
    }

    @Bean
    public ReqResGetPojo getPojo(){
        return new ReqResGetPojo();
    }

    @Bean
    public RestTemplate getRestPojo(){
        return new RestTemplate();
    }
    public void reqResServices() {
        new ReqResServices().getResponse();
    }

}

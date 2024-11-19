package com.retail.cart.services;

import com.retail.cart.entity.ReqResGetPojo;
import com.retail.cart.entity.ReqResResponsePojo;
import com.retail.cart.entity.SingleUserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class ReqResServices {

    private static final String BASE_URL = "https://reqres.in";
    private static final String GET_ALL_USERS = "/api/users/";

    @Autowired
    private ReqResGetPojo reqResGetPojo;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<?> getResponse() {
        String getUrl = BASE_URL + GET_ALL_USERS;
        ResponseEntity<ReqResResponsePojo> response = restTemplate.exchange(
                getUrl,
                HttpMethod.GET,
                null,
                ReqResResponsePojo.class
        );
        return ResponseEntity.ok(response.getBody());
    }

    public ResponseEntity<?> getSingleResponse(String id) {
        String getUrl = BASE_URL +GET_ALL_USERS + id;
        ResponseEntity<SingleUserPojo> response = restTemplate.exchange(
                getUrl,
                HttpMethod.GET,
                null,
                SingleUserPojo.class
        );
        return ResponseEntity.ok(response.getBody());
    }

    public ResponseEntity<?> createUser(String name, String job){
        String url = BASE_URL+GET_ALL_USERS;
        Map<String, String> requestBody= new  HashMap();
        requestBody.put("name",name);
        requestBody.put("job",job);
        ResponseEntity<Map> mapResponseEntity = restTemplate.postForEntity(url, requestBody, Map.class);
        return ResponseEntity.ok(mapResponseEntity.getBody());
    }
}

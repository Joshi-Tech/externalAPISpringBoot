package com.retail.cart;

import com.retail.cart.services.ReqResServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class ReqResController {

    @Autowired
    private ReqResServices reqResServices;

    @GetMapping
    public ResponseEntity<?> getUserDetails() {
        return reqResServices.getResponse();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSingleUserDetails(@PathVariable String id) {
        return reqResServices.getSingleResponse(id);
    }

    @PostMapping("/create")
    public ResponseEntity<?> postUser(@RequestParam String name, @RequestParam String job ) {
        return reqResServices.createUser(name, job);
    }


}

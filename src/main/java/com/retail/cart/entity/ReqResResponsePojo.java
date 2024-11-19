// ReqResResponsePojo.java
package com.retail.cart.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ReqResResponsePojo {
    private int page;
    @JsonProperty("perPage")
    private int per_page;
    private int total;
    @JsonProperty("totalPages")
    private int total_pages;
    //private ReqResGetPojo data;
    private List<ReqResGetPojo> data;
}

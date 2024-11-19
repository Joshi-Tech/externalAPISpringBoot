package com.retail.cart.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SingleUserPojo {
    private int page;
    @JsonProperty("perPage")
    private int per_page;
    private int total;
    @JsonProperty("totalPages")
    private int total_pages;
    private ReqResGetPojo data;
}

package com.dragan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SelfServiceRequestDataEntry {
    @JsonProperty("reason")
    private String reason;

    @JsonProperty("orderId")
    private String orderId;

    @JsonProperty("userName")
    private String userName;

    @JsonProperty("items")
    private List<SelfServiceRequestDataEntryItem> requestItems;

    public String getOrderId() {
        return orderId;
    }

    public String getReason() {
        return reason;
    }

    public String getUserName() {
        return userName;
    }

    public List<SelfServiceRequestDataEntryItem> getRequestItems() {
        return requestItems;
    }
}

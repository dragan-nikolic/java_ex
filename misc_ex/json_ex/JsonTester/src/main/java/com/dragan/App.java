package com.dragan;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"requestList\": [" +
                "{\"orderId\": \"o001\", \"type\": \"CANCEL\"}," +
                "{\"orderId\": \"o001\", \"type\": \"EDIT\"}]}";
        RequestList requestList = mapper.readerFor(RequestList.class).readValue(json);
        System.out.println(requestList.requestList.get(0).getOrderId());
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Request {
    @JsonProperty("orderId")
    private String orderId;

    @JsonProperty("type")
    private String type;

    public String getOrderId() {
        return orderId;
    }

    public String getType() {
        return type;
    }

    
}

@JsonIgnoreProperties(ignoreUnknown = true)
class RequestList {
    @JsonProperty("requestList")
    List<Request> requestList;
}

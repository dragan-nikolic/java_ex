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
        String json =
                "[" +
                    "{" +
                        "\"orderId\": \"o001\"," +
                        "\"type\": \"CANCEL\"," +
                        "\"selfServiceRequestData\": " +
                            "[" +
                                "{" +
                                    "\"items\": " +
                                        "[" +
                                            "{" +
                                                "\"id\": \"o001\"," +
                                                "\"reason\": \"1\"" +
                                            "}" +
                                        "]," +
                                    "\"userName\": \"dragan\"" +
                                "}" +
                            "]" +
                    "}" +
                "]";
        Request[] requestList = mapper.readerFor(Request[].class).readValue(json);
        System.out.println(requestList[0].getOrderId());
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Request {
    @JsonProperty("orderId")
    private String orderId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("selfServiceRequestData")
    private SelfServiceRequestDataEntry[] selfServiceRequestData;

    public String getOrderId() {
        return orderId;
    }

    public String getType() {
        return type;
    }

    public SelfServiceRequestDataEntry[] getSelfServiceRequestData() {
        return selfServiceRequestData;
    }
}

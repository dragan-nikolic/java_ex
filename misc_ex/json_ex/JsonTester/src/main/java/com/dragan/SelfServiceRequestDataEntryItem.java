package com.dragan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SelfServiceRequestDataEntryItem {
    @JsonProperty("id")
    private String id;

    @JsonProperty("reason")
    private String reason;

    public String getReason() {
        return reason;
    }

    public String getId() {
        return id;
    }
}

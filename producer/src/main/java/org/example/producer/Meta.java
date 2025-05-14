package org.example.producer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Meta {
    private String uri;

    @JsonProperty("request_id")
    private String requestId;

    private String id;
    private String dt;
    private String domain;
    private String stream;
    private String topic;
    private int partition;
    private long offset;

}

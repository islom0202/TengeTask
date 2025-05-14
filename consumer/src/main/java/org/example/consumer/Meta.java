package org.example.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
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

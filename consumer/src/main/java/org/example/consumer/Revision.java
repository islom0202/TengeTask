package org.example.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Revision {
    private long old;
    private long _new;

    @JsonProperty("new")
    public long getNew() {
        return _new;
    }

    @JsonProperty("new")
    public void setNew(long _new) {
        this._new = _new;
    }

}

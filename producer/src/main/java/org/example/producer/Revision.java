package org.example.producer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
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

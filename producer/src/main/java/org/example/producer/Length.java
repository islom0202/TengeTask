package org.example.producer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Length {
    private int old;
    private int _new;

    @JsonProperty("new")
    public int getNew() {
        return _new;
    }

    @JsonProperty("new")
    public void setNew(int _new) {
        this._new = _new;
    }
}

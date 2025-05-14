package org.example.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
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

package com.miageif.projectweb.Alpha_Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class TimeSeriesDaily {
    @JsonProperty("1. open")
    String open;
    @JsonProperty("2. high")
    String high;
    @JsonProperty("3. low")
    String low;
    @JsonProperty("6. volume")
    String volume;
}

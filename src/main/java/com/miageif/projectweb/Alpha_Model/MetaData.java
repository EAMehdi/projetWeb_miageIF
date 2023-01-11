package com.miageif.projectweb.Alpha_Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Meta Data")
public class MetaData {
    @JsonProperty("1. Information")
    String information;
    @JsonProperty("2. Symbol")
    String symbol;

}

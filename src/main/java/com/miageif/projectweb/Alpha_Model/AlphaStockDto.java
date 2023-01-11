package com.miageif.projectweb.Alpha_Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class AlphaStockDto {
    // @JsonProperty("")
    private MetaData metaData;
    @JsonProperty
    private Map<String, TimeSeriesDaily> timeSeriesDaily;
}

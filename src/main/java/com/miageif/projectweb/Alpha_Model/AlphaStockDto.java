package com.miageif.projectweb.Alpha_Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Map;


public class AlphaStockDto {
    private MetaData metaData;
    private Map<String, TimeSeriesDaily> timeSeriesDaily;
}

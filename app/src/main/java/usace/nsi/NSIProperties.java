package usace.nsi;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NSIProperties {
    @JsonProperty("fd_id")
    public Long fdId;
    public String bid;
    public String occtype;
    @JsonProperty("st_damcat") 
    public String stDamcat;
    public String bldgtype;
    @JsonProperty("found_type") 
    public String foundType;
    public String cbfips;
    public Integer pop2amu65;
    public Integer pop2amo65;
    public Integer pop2pmu65;
    public Integer pop2pmo65;
    public Double sqft;
    @JsonProperty("num_story") 
    public Integer numStory;
    @JsonProperty("ftprntid") 
    public String ftprntid;
    @JsonProperty("ftprntsrc") 
    public String ftprntsrc;
    public Integer students;
    @JsonProperty("found_ht") 
    public Double foundHt;
    @JsonProperty("val_struct") public 
    Double valStruct;
    @JsonProperty("val_cont") public 
    Double valCont;
    @JsonProperty("val_vehic") public 
    Double valVehic;
    public String source;
    @JsonProperty("med_yr_blt") public 
    Integer medYrBlt;
    public String firmzone;
    public Double o65disable;
    public Double u65disable;
    public Double x;
    public Double y;
    @JsonProperty("ground_elv") public Double groundElv;
    @JsonProperty("ground_elv_m") public Double groundElvm;
}

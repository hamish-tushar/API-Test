
package insightly.model.v22;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LINK_ID",
    "CONTACT_ID",
    "OPPORTUNITY_ID",
    "ORGANISATION_ID",
    "PROJECT_ID",
    "SECOND_PROJECT_ID",
    "SECOND_OPPORTUNITY_ID",
    "ROLE",
    "DETAILS"
})
public class LINK {

    @JsonProperty("LINK_ID")
    private Integer lINKID;
    @JsonProperty("CONTACT_ID")
    private Integer cONTACTID;
    @JsonProperty("OPPORTUNITY_ID")
    private Object oPPORTUNITYID;
    @JsonProperty("ORGANISATION_ID")
    private Integer oRGANISATIONID;
    @JsonProperty("PROJECT_ID")
    private Object pROJECTID;
    @JsonProperty("SECOND_PROJECT_ID")
    private Object sECONDPROJECTID;
    @JsonProperty("SECOND_OPPORTUNITY_ID")
    private Object sECONDOPPORTUNITYID;
    @JsonProperty("ROLE")
    private Object rOLE;
    @JsonProperty("DETAILS")
    private Object dETAILS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LINK_ID")
    public Integer getLINKID() {
        return lINKID;
    }

    @JsonProperty("LINK_ID")
    public void setLINKID(Integer lINKID) {
        this.lINKID = lINKID;
    }

    @JsonProperty("CONTACT_ID")
    public Integer getCONTACTID() {
        return cONTACTID;
    }

    @JsonProperty("CONTACT_ID")
    public void setCONTACTID(Integer cONTACTID) {
        this.cONTACTID = cONTACTID;
    }

    @JsonProperty("OPPORTUNITY_ID")
    public Object getOPPORTUNITYID() {
        return oPPORTUNITYID;
    }

    @JsonProperty("OPPORTUNITY_ID")
    public void setOPPORTUNITYID(Object oPPORTUNITYID) {
        this.oPPORTUNITYID = oPPORTUNITYID;
    }

    @JsonProperty("ORGANISATION_ID")
    public Integer getORGANISATIONID() {
        return oRGANISATIONID;
    }

    @JsonProperty("ORGANISATION_ID")
    public void setORGANISATIONID(Integer oRGANISATIONID) {
        this.oRGANISATIONID = oRGANISATIONID;
    }

    @JsonProperty("PROJECT_ID")
    public Object getPROJECTID() {
        return pROJECTID;
    }

    @JsonProperty("PROJECT_ID")
    public void setPROJECTID(Object pROJECTID) {
        this.pROJECTID = pROJECTID;
    }

    @JsonProperty("SECOND_PROJECT_ID")
    public Object getSECONDPROJECTID() {
        return sECONDPROJECTID;
    }

    @JsonProperty("SECOND_PROJECT_ID")
    public void setSECONDPROJECTID(Object sECONDPROJECTID) {
        this.sECONDPROJECTID = sECONDPROJECTID;
    }

    @JsonProperty("SECOND_OPPORTUNITY_ID")
    public Object getSECONDOPPORTUNITYID() {
        return sECONDOPPORTUNITYID;
    }

    @JsonProperty("SECOND_OPPORTUNITY_ID")
    public void setSECONDOPPORTUNITYID(Object sECONDOPPORTUNITYID) {
        this.sECONDOPPORTUNITYID = sECONDOPPORTUNITYID;
    }

    @JsonProperty("ROLE")
    public Object getROLE() {
        return rOLE;
    }

    @JsonProperty("ROLE")
    public void setROLE(Object rOLE) {
        this.rOLE = rOLE;
    }

    @JsonProperty("DETAILS")
    public Object getDETAILS() {
        return dETAILS;
    }

    @JsonProperty("DETAILS")
    public void setDETAILS(Object dETAILS) {
        this.dETAILS = dETAILS;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}

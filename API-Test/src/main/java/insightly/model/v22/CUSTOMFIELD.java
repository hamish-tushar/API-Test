
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
    "CUSTOM_FIELD_ID",
    "FIELD_VALUE"
})
public class CUSTOMFIELD {

    @JsonProperty("CUSTOM_FIELD_ID")
    private String cUSTOMFIELDID;
    @JsonProperty("FIELD_VALUE")
    private String fIELDVALUE;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CUSTOM_FIELD_ID")
    public String getCUSTOMFIELDID() {
        return cUSTOMFIELDID;
    }

    @JsonProperty("CUSTOM_FIELD_ID")
    public void setCUSTOMFIELDID(String cUSTOMFIELDID) {
        this.cUSTOMFIELDID = cUSTOMFIELDID;
    }

    @JsonProperty("FIELD_VALUE")
    public String getFIELDVALUE() {
        return fIELDVALUE;
    }

    @JsonProperty("FIELD_VALUE")
    public void setFIELDVALUE(String fIELDVALUE) {
        this.fIELDVALUE = fIELDVALUE;
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

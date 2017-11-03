
package insightly.model.v22;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"OPPORTUNITY_ID",
"OPPORTUNITY_NAME",
"OPPORTUNITY_DETAILS",
"PROBABILITY",
"BID_CURRENCY",
"BID_AMOUNT",
"BID_TYPE",
"BID_DURATION",
"OPPORTUNITY_VALUE",
"FORECAST_CLOSE_DATE",
"ACTUAL_CLOSE_DATE",
"CATEGORY_ID",
"PIPELINE_ID",
"STAGE_ID",
"OPPORTUNITY_STATE",
"OPPORTUNITY_STATE_REASON_ID",
"IMAGE_URL",
"RESPONSIBLE_USER_ID",
"OWNER_USER_ID",
"DATE_CREATED_UTC",
"DATE_UPDATED_UTC",
"VISIBLE_TO",
"VISIBLE_TEAM_ID",
"VISIBLE_USER_IDS",
"CUSTOMFIELDS",
"TAGS",
"LINKS",
"CAN_EDIT",
"CAN_DELETE"
})
public class Opportunity {

@JsonProperty("OPPORTUNITY_ID")
public Integer oPPORTUNITYID;
@JsonProperty("OPPORTUNITY_NAME")
public String oPPORTUNITYNAME;
@JsonProperty("OPPORTUNITY_DETAILS")
public String oPPORTUNITYDETAILS;
@JsonProperty("PROBABILITY")
public Integer pROBABILITY;
@JsonProperty("BID_CURRENCY")
public String bIDCURRENCY;
@JsonProperty("BID_AMOUNT")
public Integer bIDAMOUNT;
@JsonProperty("BID_TYPE")
public String bIDTYPE;
@JsonProperty("BID_DURATION")
public Integer bIDDURATION;
@JsonProperty("OPPORTUNITY_VALUE")
public Integer oPPORTUNITYVALUE;
@JsonProperty("FORECAST_CLOSE_DATE")
public String fORECASTCLOSEDATE;
@JsonProperty("ACTUAL_CLOSE_DATE")
public String aCTUALCLOSEDATE;
@JsonProperty("CATEGORY_ID")
public Integer cATEGORYID;
@JsonProperty("PIPELINE_ID")
public Integer pIPELINEID;
@JsonProperty("STAGE_ID")
public Integer sTAGEID;
@JsonProperty("OPPORTUNITY_STATE")
public String oPPORTUNITYSTATE;
@JsonProperty("OPPORTUNITY_STATE_REASON_ID")
public Integer oPPORTUNITYSTATEREASONID;
@JsonProperty("IMAGE_URL")
public String iMAGEURL;
@JsonProperty("RESPONSIBLE_USER_ID")
public Integer rESPONSIBLEUSERID;
@JsonProperty("OWNER_USER_ID")
public Integer oWNERUSERID;
@JsonProperty("DATE_CREATED_UTC")
public String dATECREATEDUTC;
@JsonProperty("DATE_UPDATED_UTC")
public String dATEUPDATEDUTC;
@JsonProperty("VISIBLE_TO")
public String vISIBLETO;
@JsonProperty("VISIBLE_TEAM_ID")
public Integer vISIBLETEAMID;
@JsonProperty("VISIBLE_USER_IDS")
public String vISIBLEUSERIDS;
@JsonProperty("CUSTOMFIELDS")
public List<CustomField> cUSTOMFIELDS = null;
@JsonProperty("TAGS")
public List<Tag> tAGS = null;
@JsonProperty("LINKS")
public List<Link> lINKS = null;
@JsonProperty("CAN_EDIT")
public Boolean cANEDIT;
@JsonProperty("CAN_DELETE")
public Boolean cANDELETE;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
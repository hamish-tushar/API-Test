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
"PROJECT_ID",
"PROJECT_NAME",
"STATUS",
"PROJECT_DETAILS",
"OPPORTUNITY_ID",
"STARTED_DATE",
"COMPLETED_DATE",
"IMAGE_URL",
"RESPONSIBLE_USER_ID",
"OWNER_USER_ID",
"DATE_CREATED_UTC",
"DATE_UPDATED_UTC",
"CATEGORY_ID",
"PIPELINE_ID",
"STAGE_ID",
"VISIBLE_TO",
"VISIBLE_TEAM_ID",
"VISIBLE_USER_IDS",
"CUSTOMFIELDS",
"TAGS",
"LINKS",
"CAN_EDIT",
"CAN_DELETE"
})
public class Project {

@JsonProperty("PROJECT_ID")
public Integer pROJECTID;
@JsonProperty("PROJECT_NAME")
public String pROJECTNAME;
@JsonProperty("STATUS")
public String sTATUS;
@JsonProperty("PROJECT_DETAILS")
public String pROJECTDETAILS;
@JsonProperty("OPPORTUNITY_ID")
public Integer oPPORTUNITYID;
@JsonProperty("STARTED_DATE")
public String sTARTEDDATE;
@JsonProperty("COMPLETED_DATE")
public String cOMPLETEDDATE;
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
@JsonProperty("CATEGORY_ID")
public Integer cATEGORYID;
@JsonProperty("PIPELINE_ID")
public Integer pIPELINEID;
@JsonProperty("STAGE_ID")
public Integer sTAGEID;
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
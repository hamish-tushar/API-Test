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
"LEAD_ID",
"SALUTATION",
"TITLE",
"FIRST_NAME",
"LAST_NAME",
"ORGANIZATION_NAME",
"PHONE_NUMBER",
"MOBILE_PHONE_NUMBER",
"FAX_NUMBER",
"EMAIL_ADDRESS",
"WEBSITE_URL",
"OWNER_USER_ID",
"DATE_CREATED_UTC",
"DATE_UPDATED_UTC",
"CONVERTED",
"CONVERTED_DATE_UTC",
"CONVERTED_CONTACT_ID",
"CONVERTED_ORGANIZATION_ID",
"CONVERTED_OPPORTUNITY_ID",
"VISIBLE_TO",
"RESPONSIBLE_USER_ID",
"INDUSTRY",
"LEAD_STATUS_ID",
"LEAD_SOURCE_ID",
"VISIBLE_TEAM_ID",
"EMPLOYEE_COUNT",
"LEAD_RATING",
"LEAD_DESCRIPTION",
"VISIBLE_USER_IDS",
"CUSTOMFIELDS",
"ADDRESS_STREET",
"ADDRESS_CITY",
"ADDRESS_STATE",
"ADDRESS_POSTCODE",
"ADDRESS_COUNTRY",
"TAGS",
"IMAGE_URL",
"CAN_EDIT",
"CAN_DELETE"
})
public class Lead {

@JsonProperty("LEAD_ID")
public Integer lEADID;
@JsonProperty("SALUTATION")
public String sALUTATION;
@JsonProperty("TITLE")
public String tITLE;
@JsonProperty("FIRST_NAME")
public String fIRSTNAME;
@JsonProperty("LAST_NAME")
public String lASTNAME;
@JsonProperty("ORGANIZATION_NAME")
public String oRGANIZATIONNAME;
@JsonProperty("PHONE_NUMBER")
public String pHONENUMBER;
@JsonProperty("MOBILE_PHONE_NUMBER")
public String mOBILEPHONENUMBER;
@JsonProperty("FAX_NUMBER")
public String fAXNUMBER;
@JsonProperty("EMAIL_ADDRESS")
public String eMAILADDRESS;
@JsonProperty("WEBSITE_URL")
public String wEBSITEURL;
@JsonProperty("OWNER_USER_ID")
public Integer oWNERUSERID;
@JsonProperty("DATE_CREATED_UTC")
public String dATECREATEDUTC;
@JsonProperty("DATE_UPDATED_UTC")
public String dATEUPDATEDUTC;
@JsonProperty("CONVERTED")
public Boolean cONVERTED;
@JsonProperty("CONVERTED_DATE_UTC")
public String cONVERTEDDATEUTC;
@JsonProperty("CONVERTED_CONTACT_ID")
public Integer cONVERTEDCONTACTID;
@JsonProperty("CONVERTED_ORGANIZATION_ID")
public Integer cONVERTEDORGANIZATIONID;
@JsonProperty("CONVERTED_OPPORTUNITY_ID")
public Integer cONVERTEDOPPORTUNITYID;
@JsonProperty("VISIBLE_TO")
public String vISIBLETO;
@JsonProperty("RESPONSIBLE_USER_ID")
public Integer rESPONSIBLEUSERID;
@JsonProperty("INDUSTRY")
public String iNDUSTRY;
@JsonProperty("LEAD_STATUS_ID")
public Integer lEADSTATUSID;
@JsonProperty("LEAD_SOURCE_ID")
public Integer lEADSOURCEID;
@JsonProperty("VISIBLE_TEAM_ID")
public Integer vISIBLETEAMID;
@JsonProperty("EMPLOYEE_COUNT")
public Integer eMPLOYEECOUNT;
@JsonProperty("LEAD_RATING")
public Integer lEADRATING;
@JsonProperty("LEAD_DESCRIPTION")
public String lEADDESCRIPTION;
@JsonProperty("VISIBLE_USER_IDS")
public String vISIBLEUSERIDS;
@JsonProperty("CUSTOMFIELDS")
public List<CustomField> cUSTOMFIELDS = null;
@JsonProperty("ADDRESS_STREET")
public String aDDRESSSTREET;
@JsonProperty("ADDRESS_CITY")
public String aDDRESSCITY;
@JsonProperty("ADDRESS_STATE")
public String aDDRESSSTATE;
@JsonProperty("ADDRESS_POSTCODE")
public String aDDRESSPOSTCODE;
@JsonProperty("ADDRESS_COUNTRY")
public String aDDRESSCOUNTRY;
@JsonProperty("TAGS")
public List<Tag> tAGS = null;
@JsonProperty("IMAGE_URL")
public String iMAGEURL;
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

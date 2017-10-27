
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
    "CONTACT_ID",
    "SALUTATION",
    "FIRST_NAME",
    "LAST_NAME",
    "BACKGROUND",
    "IMAGE_URL",
    "DEFAULT_LINKED_ORGANISATION",
    "OWNER_USER_ID",
    "DATE_CREATED_UTC",
    "DATE_UPDATED_UTC",
    "VISIBLE_TO",
    "VISIBLE_TEAM_ID",
    "VISIBLE_USER_IDS",
    "CUSTOMFIELDS",
    "ADDRESSES",
    "CONTACTINFOS",
    "DATES",
    "TAGS",
    "LINKS",
    "CONTACTLINKS",
    "CAN_EDIT",
    "CAN_DELETE",
    "SOCIAL_LINKEDIN",
    "SOCIAL_FACEBOOK",
    "SOCIAL_TWITTER",
    "ASSISTANT_NAME"
})
public class Contact {

    @JsonProperty("CONTACT_ID")
    private Integer cONTACTID;
    @JsonProperty("SALUTATION")
    private Object sALUTATION;
    @JsonProperty("FIRST_NAME")
    private String fIRSTNAME;
    @JsonProperty("LAST_NAME")
    private String lASTNAME;
    @JsonProperty("BACKGROUND")
    private String bACKGROUND;
    @JsonProperty("IMAGE_URL")
    private Object iMAGEURL;
    @JsonProperty("DEFAULT_LINKED_ORGANISATION")
    private Integer dEFAULTLINKEDORGANISATION;
    @JsonProperty("OWNER_USER_ID")
    private Integer oWNERUSERID;
    @JsonProperty("DATE_CREATED_UTC")
    private String dATECREATEDUTC;
    @JsonProperty("DATE_UPDATED_UTC")
    private String dATEUPDATEDUTC;
    @JsonProperty("VISIBLE_TO")
    private String vISIBLETO;
    @JsonProperty("VISIBLE_TEAM_ID")
    private Object vISIBLETEAMID;
    @JsonProperty("VISIBLE_USER_IDS")
    private Object vISIBLEUSERIDS;
    @JsonProperty("CUSTOMFIELDS")
    private List<CUSTOMFIELD> cUSTOMFIELDS = null;
    @JsonProperty("ADDRESSES")
    private Object aDDRESSES;
    @JsonProperty("CONTACTINFOS")
    private Object cONTACTINFOS;
    @JsonProperty("DATES")
    private List<Object> dATES = null;
    @JsonProperty("TAGS")
    private List<Object> tAGS = null;
    @JsonProperty("LINKS")
    private List<LINK> lINKS = null;
    @JsonProperty("CONTACTLINKS")
    private List<Object> cONTACTLINKS = null;
    @JsonProperty("CAN_EDIT")
    private Boolean cANEDIT;
    @JsonProperty("CAN_DELETE")
    private Boolean cANDELETE;
    @JsonProperty("SOCIAL_LINKEDIN")
    private String sOCIALLINKEDIN;
    @JsonProperty("SOCIAL_FACEBOOK")
    private String sOCIALFACEBOOK;
    @JsonProperty("SOCIAL_TWITTER")
    private String sOCIALTWITTER;
    @JsonProperty("ASSISTANT_NAME")
    private Object aSSISTANTNAME;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CONTACT_ID")
    public Integer getCONTACTID() {
        return cONTACTID;
    }

    @JsonProperty("CONTACT_ID")
    public void setCONTACTID(Integer cONTACTID) {
        this.cONTACTID = cONTACTID;
    }

    @JsonProperty("SALUTATION")
    public Object getSALUTATION() {
        return sALUTATION;
    }

    @JsonProperty("SALUTATION")
    public void setSALUTATION(Object sALUTATION) {
        this.sALUTATION = sALUTATION;
    }

    @JsonProperty("FIRST_NAME")
    public String getFIRSTNAME() {
        return fIRSTNAME;
    }

    @JsonProperty("FIRST_NAME")
    public void setFIRSTNAME(String fIRSTNAME) {
        this.fIRSTNAME = fIRSTNAME;
    }

    @JsonProperty("LAST_NAME")
    public String getLASTNAME() {
        return lASTNAME;
    }

    @JsonProperty("LAST_NAME")
    public void setLASTNAME(String lASTNAME) {
        this.lASTNAME = lASTNAME;
    }

    @JsonProperty("BACKGROUND")
    public String getBACKGROUND() {
        return bACKGROUND;
    }

    @JsonProperty("BACKGROUND")
    public void setBACKGROUND(String bACKGROUND) {
        this.bACKGROUND = bACKGROUND;
    }

    @JsonProperty("IMAGE_URL")
    public Object getIMAGEURL() {
        return iMAGEURL;
    }

    @JsonProperty("IMAGE_URL")
    public void setIMAGEURL(Object iMAGEURL) {
        this.iMAGEURL = iMAGEURL;
    }

    @JsonProperty("DEFAULT_LINKED_ORGANISATION")
    public Integer getDEFAULTLINKEDORGANISATION() {
        return dEFAULTLINKEDORGANISATION;
    }

    @JsonProperty("DEFAULT_LINKED_ORGANISATION")
    public void setDEFAULTLINKEDORGANISATION(Integer dEFAULTLINKEDORGANISATION) {
        this.dEFAULTLINKEDORGANISATION = dEFAULTLINKEDORGANISATION;
    }

    @JsonProperty("OWNER_USER_ID")
    public Integer getOWNERUSERID() {
        return oWNERUSERID;
    }

    @JsonProperty("OWNER_USER_ID")
    public void setOWNERUSERID(Integer oWNERUSERID) {
        this.oWNERUSERID = oWNERUSERID;
    }

    @JsonProperty("DATE_CREATED_UTC")
    public String getDATECREATEDUTC() {
        return dATECREATEDUTC;
    }

    @JsonProperty("DATE_CREATED_UTC")
    public void setDATECREATEDUTC(String dATECREATEDUTC) {
        this.dATECREATEDUTC = dATECREATEDUTC;
    }

    @JsonProperty("DATE_UPDATED_UTC")
    public String getDATEUPDATEDUTC() {
        return dATEUPDATEDUTC;
    }

    @JsonProperty("DATE_UPDATED_UTC")
    public void setDATEUPDATEDUTC(String dATEUPDATEDUTC) {
        this.dATEUPDATEDUTC = dATEUPDATEDUTC;
    }

    @JsonProperty("VISIBLE_TO")
    public String getVISIBLETO() {
        return vISIBLETO;
    }

    @JsonProperty("VISIBLE_TO")
    public void setVISIBLETO(String vISIBLETO) {
        this.vISIBLETO = vISIBLETO;
    }

    @JsonProperty("VISIBLE_TEAM_ID")
    public Object getVISIBLETEAMID() {
        return vISIBLETEAMID;
    }

    @JsonProperty("VISIBLE_TEAM_ID")
    public void setVISIBLETEAMID(Object vISIBLETEAMID) {
        this.vISIBLETEAMID = vISIBLETEAMID;
    }

    @JsonProperty("VISIBLE_USER_IDS")
    public Object getVISIBLEUSERIDS() {
        return vISIBLEUSERIDS;
    }

    @JsonProperty("VISIBLE_USER_IDS")
    public void setVISIBLEUSERIDS(Object vISIBLEUSERIDS) {
        this.vISIBLEUSERIDS = vISIBLEUSERIDS;
    }

    @JsonProperty("CUSTOMFIELDS")
    public List<CUSTOMFIELD> getCUSTOMFIELDS() {
        return cUSTOMFIELDS;
    }

    @JsonProperty("CUSTOMFIELDS")
    public void setCUSTOMFIELDS(List<CUSTOMFIELD> cUSTOMFIELDS) {
        this.cUSTOMFIELDS = cUSTOMFIELDS;
    }

    @JsonProperty("ADDRESSES")
    public Object getADDRESSES() {
        return aDDRESSES;
    }

    @JsonProperty("ADDRESSES")
    public void setADDRESSES(Object aDDRESSES) {
        this.aDDRESSES = aDDRESSES;
    }

    @JsonProperty("CONTACTINFOS")
    public Object getCONTACTINFOS() {
        return cONTACTINFOS;
    }

    @JsonProperty("CONTACTINFOS")
    public void setCONTACTINFOS(Object cONTACTINFOS) {
        this.cONTACTINFOS = cONTACTINFOS;
    }

    @JsonProperty("DATES")
    public List<Object> getDATES() {
        return dATES;
    }

    @JsonProperty("DATES")
    public void setDATES(List<Object> dATES) {
        this.dATES = dATES;
    }

    @JsonProperty("TAGS")
    public List<Object> getTAGS() {
        return tAGS;
    }

    @JsonProperty("TAGS")
    public void setTAGS(List<Object> tAGS) {
        this.tAGS = tAGS;
    }

    @JsonProperty("LINKS")
    public List<LINK> getLINKS() {
        return lINKS;
    }

    @JsonProperty("LINKS")
    public void setLINKS(List<LINK> lINKS) {
        this.lINKS = lINKS;
    }

    @JsonProperty("CONTACTLINKS")
    public List<Object> getCONTACTLINKS() {
        return cONTACTLINKS;
    }

    @JsonProperty("CONTACTLINKS")
    public void setCONTACTLINKS(List<Object> cONTACTLINKS) {
        this.cONTACTLINKS = cONTACTLINKS;
    }

    @JsonProperty("CAN_EDIT")
    public Boolean getCANEDIT() {
        return cANEDIT;
    }

    @JsonProperty("CAN_EDIT")
    public void setCANEDIT(Boolean cANEDIT) {
        this.cANEDIT = cANEDIT;
    }

    @JsonProperty("CAN_DELETE")
    public Boolean getCANDELETE() {
        return cANDELETE;
    }

    @JsonProperty("CAN_DELETE")
    public void setCANDELETE(Boolean cANDELETE) {
        this.cANDELETE = cANDELETE;
    }

    @JsonProperty("SOCIAL_LINKEDIN")
    public String getSOCIALLINKEDIN() {
        return sOCIALLINKEDIN;
    }

    @JsonProperty("SOCIAL_LINKEDIN")
    public void setSOCIALLINKEDIN(String sOCIALLINKEDIN) {
        this.sOCIALLINKEDIN = sOCIALLINKEDIN;
    }

    @JsonProperty("SOCIAL_FACEBOOK")
    public String getSOCIALFACEBOOK() {
        return sOCIALFACEBOOK;
    }

    @JsonProperty("SOCIAL_FACEBOOK")
    public void setSOCIALFACEBOOK(String sOCIALFACEBOOK) {
        this.sOCIALFACEBOOK = sOCIALFACEBOOK;
    }

    @JsonProperty("SOCIAL_TWITTER")
    public String getSOCIALTWITTER() {
        return sOCIALTWITTER;
    }

    @JsonProperty("SOCIAL_TWITTER")
    public void setSOCIALTWITTER(String sOCIALTWITTER) {
        this.sOCIALTWITTER = sOCIALTWITTER;
    }

    @JsonProperty("ASSISTANT_NAME")
    public Object getASSISTANTNAME() {
        return aSSISTANTNAME;
    }

    @JsonProperty("ASSISTANT_NAME")
    public void setASSISTANTNAME(Object aSSISTANTNAME) {
        this.aSSISTANTNAME = aSSISTANTNAME;
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

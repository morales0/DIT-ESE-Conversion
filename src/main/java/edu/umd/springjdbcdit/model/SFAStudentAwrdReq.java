/**
 * Class representing form.
 * 
 */

package edu.umd.springjdbcdit.model;

//Table: SFA.SFA_STU_AWRD_REQ A
public class SFAStudentAwrdReq {
   // Instance variables
   private Long U_ID;
   private String AIDID, INSRT_DT, INSRT_U_ID, AWRD_AMT, SCHTYPE_CD, CEREMONIAL_CHECK_IND;
   private String TUITION_REMISSION_CD, STAT_CD, INTERNATIONAL_IND;
   private String SAM_POST_DT, SAM_POSTED_IND, POST_DT, SYSDATE, REQ_TEXT;

   // Used for extracting
   public static String[] columnNames = {"U_ID", "AID_ID", "INSRT_DT", "INSRT_U_ID", "AWRD_AMT", 
                  "SCHTYPE_CD", "CEREMONIAL_CHECK_IND", "TUITION_REMISSION_CD",
                  "STAT_CD", "INTERNATIONAL_IND", "SAM_POST_DT", "SAM_POSTED_IND",
                  "POST_DT", "SYSDATE", "REQ_TEXT"};


   public SFAStudentAwrdReq() {
   }

   public SFAStudentAwrdReq(Long U_ID, String AIDID, String INSRT_DT, String INSRT_U_ID, 
         String AWRD_AMT, String SCHTYPE_CD, String CEREMONIAL_CHECK_IND, String TUITION_REMISSION_CD, 
         String STAT_CD, String INTERNATIONAL_IND, String SAM_POST_DT, String SAM_POSTED_IND, 
         String POST_DT, String SYSDATE, String REQ_TEXT) {
      this.U_ID = U_ID;
      this.AIDID = AIDID;
      this.INSRT_DT = INSRT_DT;
      this.INSRT_U_ID = INSRT_U_ID;
      this.AWRD_AMT = AWRD_AMT;
      this.SCHTYPE_CD = SCHTYPE_CD;
      this.CEREMONIAL_CHECK_IND = CEREMONIAL_CHECK_IND;
      this.TUITION_REMISSION_CD = TUITION_REMISSION_CD;
      this.STAT_CD = STAT_CD;
      this.INTERNATIONAL_IND = INTERNATIONAL_IND;
      this.SAM_POST_DT = SAM_POST_DT;
      this.SAM_POSTED_IND = SAM_POSTED_IND;
      this.POST_DT = POST_DT;
      this.SYSDATE = SYSDATE;
      this.REQ_TEXT = REQ_TEXT;
   }

   /* Getters and Setters */

   public Long getU_ID() {
      return this.U_ID;
   }

   public void setU_ID(Long U_ID) {
      this.U_ID = U_ID;
   }

   public String getAIDID() {
      return this.AIDID;
   }

   public void setAIDID(String AIDID) {
      this.AIDID = AIDID;
   }

   public String getINSRT_DT() {
      return this.INSRT_DT;
   }

   public void setINSRT_DT(String INSRT_DT) {
      this.INSRT_DT = INSRT_DT;
   }

   public String getINSRT_U_ID() {
      return this.INSRT_U_ID;
   }

   public void setINSRT_U_ID(String INSRT_U_ID) {
      this.INSRT_U_ID = INSRT_U_ID;
   }

   public String getAWRD_AMT() {
      return this.AWRD_AMT;
   }

   public void setAWRD_AMT(String AWRD_AMT) {
      this.AWRD_AMT = AWRD_AMT;
   }

   public String getSCHTYPE_CD() {
      return this.SCHTYPE_CD;
   }

   public void setSCHTYPE_CD(String SCHTYPE_CD) {
      this.SCHTYPE_CD = SCHTYPE_CD;
   }

   public String getCEREMONIAL_CHECK_IND() {
      return this.CEREMONIAL_CHECK_IND;
   }

   public void setCEREMONIAL_CHECK_IND(String CEREMONIAL_CHECK_IND) {
      this.CEREMONIAL_CHECK_IND = CEREMONIAL_CHECK_IND;
   }

   public String getTUITION_REMISSION_CD() {
      return this.TUITION_REMISSION_CD;
   }

   public void setTUITION_REMISSION_CD(String TUITION_REMISSION_CD) {
      this.TUITION_REMISSION_CD = TUITION_REMISSION_CD;
   }

   public String getSTAT_CD() {
      return this.STAT_CD;
   }

   public void setSTAT_CD(String STAT_CD) {
      this.STAT_CD = STAT_CD;
   }

   public String getINTERNATIONAL_IND() {
      return this.INTERNATIONAL_IND;
   }

   public void setINTERNATIONAL_IND(String INTERNATIONAL_IND) {
      this.INTERNATIONAL_IND = INTERNATIONAL_IND;
   }

   public String getSAM_POST_DT() {
      return this.SAM_POST_DT;
   }

   public void setSAM_POST_DT(String SAM_POST_DT) {
      this.SAM_POST_DT = SAM_POST_DT;
   }

   public String getSAM_POSTED_IND() {
      return this.SAM_POSTED_IND;
   }

   public void setSAM_POSTED_IND(String SAM_POSTED_IND) {
      this.SAM_POSTED_IND = SAM_POSTED_IND;
   }

   public String getPOST_DT() {
      return this.POST_DT;
   }

   public void setPOST_DT(String POST_DT) {
      this.POST_DT = POST_DT;
   }

   public String getSYSDATE() {
      return this.SYSDATE;
   }

   public void setSYSDATE(String SYSDATE) {
      this.SYSDATE = SYSDATE;
   }

   public String getREQ_TEXT() {
      return this.REQ_TEXT;
   }

   public void setREQ_TEXT(String REQ_TEXT) {
      this.REQ_TEXT = REQ_TEXT;
   }

}
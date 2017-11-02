package com.tsi2.streamrain.model.generator;
// Generated 04/10/2017 11:03:07 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * UserFavsId generated by hbm2java
 */
public class UserFavsId  implements java.io.Serializable {


     private int userId;
     private int contentId;
     private Date date;

    public UserFavsId() {
    }

    public UserFavsId(int userId, int contentId, Date date) {
       this.userId = userId;
       this.contentId = contentId;
       this.date = date;
    }
   
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getContentId() {
        return this.contentId;
    }
    
    public void setContentId(int contentId) {
        this.contentId = contentId;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserFavsId) ) return false;
		 UserFavsId castOther = ( UserFavsId ) other; 
         
		 return (this.getUserId()==castOther.getUserId())
 && (this.getContentId()==castOther.getContentId())
 && ( (this.getDate()==castOther.getDate()) || ( this.getDate()!=null && castOther.getDate()!=null && this.getDate().equals(castOther.getDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUserId();
         result = 37 * result + this.getContentId();
         result = 37 * result + ( getDate() == null ? 0 : this.getDate().hashCode() );
         return result;
   }   


}


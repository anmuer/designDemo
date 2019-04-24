package prototype;

public class WorkExperience implements Cloneable{

     String date;
     String company;

     String getDate() {
        return date;
    }

     void setDate(String date) {
        this.date = date;
    }

     String getCompany() {
        return company;
    }

     void setCompany(String company) {
        this.company = company;
    }

    public Object clone(){
        try {
            return (Object)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}

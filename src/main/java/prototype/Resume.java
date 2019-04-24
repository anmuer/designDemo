package prototype;

public class Resume implements Cloneable{

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;


    /**
     * 浅拷贝
     * @param name
     */

    public Resume(String name){
        this.name = name;
    }
    public void setPersonalInfo1(String sex,String age){
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience1(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }
    public void display1(){
        System.out.println(name+" "+sex+" "+age);
        System.out.println("工作经历："+timeArea+" "+company);
    }
    public Object clone1(){
        try {
            return (Object)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 深拷贝
     */
    private WorkExperience workExperience;

     Resume(){
        workExperience = new WorkExperience();
    }
    private Resume(WorkExperience workExperience){
        this.workExperience = (WorkExperience)workExperience.clone();
    }
     void setPersonalInfo2(String name,String sex,String age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
     void setWorkExperience2(String date, String company){
        workExperience.setCompany(company);
        workExperience.setDate(date);
    }
    public void display2(){
        System.out.println(name+" "+sex+" "+age);
        System.out.println("工作经历："+workExperience.getDate()+" "+workExperience.getCompany());
    }

     Object clone2(){
        Resume obj = new Resume(this.workExperience);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }



}

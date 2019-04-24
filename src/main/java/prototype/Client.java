package prototype;

public class Client {

    public static void main(String[] args){

        /**
         * 浅拷贝
         */
        Resume a = new Resume("cai");
        a.setPersonalInfo1("男","21");
        a.setWorkExperience1("2017.7-2018.7","opp");

        Resume b = (Resume)a.clone1();
        b.setWorkExperience1("2018.7-2019.10","vvv");
        Resume c = (Resume)a.clone1();
        c.setWorkExperience1("2019.11-2020.11","ahaha");

        System.out.println("********浅拷贝**********");
        a.display1();
        b.display1();
        c.display1();

        /**
         * 深拷贝
         */
        Resume a2 = new Resume();
        a2.setPersonalInfo2("cai","男","22");
        a2.setWorkExperience2("2017.7-2018.7","op-p");

        Resume b2 = (Resume)a2.clone2();
        b2.setWorkExperience2("2018.7-2019.10","vv-p");

        Resume c2 = (Resume)a2.clone2();
        c2.setPersonalInfo2("cai","男","24");
        c2.setWorkExperience2("2019.11-2020.11","ah-p");

        System.out.println("********深拷贝**********");
        a2.display2();
        b2.display2();
        c2.display2();

    }

}

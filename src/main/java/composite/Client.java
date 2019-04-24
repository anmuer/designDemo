package composite;

public class Client {

    public static void main(String[] args){

         ConcreateCompany root = new ConcreateCompany("北京总公司");
         root.add(new HRDepartment("总公司人力资源部"));
         root.add(new FinanceDepartment("总公司财务部"));

         ConcreateCompany company = new ConcreateCompany("上海华东分公司");
         company.add(new HRDepartment("华东分公司人力资源部"));
         company.add(new FinanceDepartment("华东分公司财务部"));

         root.add(company);

         ConcreateCompany company1 = new ConcreateCompany("南京办事处");
         company1.add(new HRDepartment("南京办事处人力资源部"));
         company1.add(new FinanceDepartment("南京办事处财务部"));

         company.add(company1);

         ConcreateCompany company2 = new ConcreateCompany("杭州办事处");
         company2.add(new HRDepartment("杭州办事处人力资源部"));
         company2.add(new FinanceDepartment("杭州办事处财务部"));

         company.add(company2);

         System.out.println("结构图：");

         root.display(1);

         System.out.println("职责：");
         root.lineOfDuty();

    }
}

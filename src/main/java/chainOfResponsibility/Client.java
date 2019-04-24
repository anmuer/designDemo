package chainOfResponsibility;

public class Client {

    public static void main(String[] args){

        CommonManager jingli = new CommonManager("经理");
        MajordomoManager zongjian = new MajordomoManager("总监");
        GeneralManager zongjingli = new GeneralManager("总经理");

        jingli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("菜菜请假");
        request.setNum(1);
        jingli.requestApplications(request);

        request.setNum(4);
        jingli.requestApplications(request);

        request.setRequestType("加薪");
        request.setRequestContent("菜菜请求加薪");
        request.setNum(500);
        jingli.requestApplications(request);

        request.setNum(1000);
        jingli.requestApplications(request);


    }

}

package chainOfResponsibility;

public class MajordomoManager extends Manager {
    MajordomoManager(String name) {
        super(name);
    }

    void requestApplications(Request request) {
        if("请假".equals(request.getRequestType()) && request.getNum() <=5) {
            System.out.println(name + ":" + request.getRequestContent() +
                    "数量 " + request.getNum() + " 被批准");
        }else {
            if(superior != null){
                superior.requestApplications(request);
            }
        }
    }
}

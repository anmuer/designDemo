package chainOfResponsibility;

public class GeneralManager extends Manager {
    GeneralManager(String name) {
        super(name);
    }

    void requestApplications(Request request) {
        if("请假".equals(request.getRequestType())) {
            System.out.println(name + ":" + request.getRequestContent() +
                    "数量 " + request.getNum() + " 被批准");
        }else if("加薪".equals(request.getRequestType()) &&request.getNum() <=500){
            System.out.println(name+":"+request.getRequestContent()+
                    "数量 "+request.getNum()+" 被批准");
        }else if("加薪".equals(request.getRequestType()) &&request.getNum() >500){
            System.out.println(name+":"+request.getRequestContent()+
                    "数量 "+request.getNum()+" 再说吧");
        }
    }
}

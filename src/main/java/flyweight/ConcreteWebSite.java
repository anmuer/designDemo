package flyweight;

public class ConcreteWebSite extends WebSite {
    private String name = "";
    ConcreteWebSite(String name){
        this.name = name;
    }
    void use() {
        System.out.println("网站分类："+name);
    }
}

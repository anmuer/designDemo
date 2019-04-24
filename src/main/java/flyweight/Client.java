package flyweight;

public class Client {
    public static void main(String[] args){
        WebSiteFactory f = new WebSiteFactory();

        WebSite fx = f.getWebSiteCategory("产品展示");
        fx.use();

        WebSite fy = f.getWebSiteCategory("产品展示");
        fy.use();

        WebSite fz = f.getWebSiteCategory("产品展示");
        fz.use();

        WebSite f1 = f.getWebSiteCategory("博客");
        f1.use();

        WebSite fm = f.getWebSiteCategory("博客");
        fm.use();

        WebSite fn = f.getWebSiteCategory("博客");
        fn.use();

        System.out.println("网站分类总数为："+f.getWebSiteCount()); // 统计实例化个数


    }
}

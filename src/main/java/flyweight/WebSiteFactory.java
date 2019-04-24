package flyweight;

import java.util.Hashtable;

public class WebSiteFactory {
    private Hashtable flyweights = new Hashtable();

    WebSite getWebSiteCategory(String key){
        if(!flyweights.contains(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return (WebSite) flyweights.get(key);
    }
    int getWebSiteCount(){
        return flyweights.size();
    }

}

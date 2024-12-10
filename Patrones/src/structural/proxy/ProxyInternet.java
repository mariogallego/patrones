package structural.proxy;

import java.util.ArrayList;
import java.util.List;

import structural.proxy.subject.AccessToInternet;
import structural.proxy.subject.Internet;

public class ProxyInternet implements Internet{

    private Internet internet = new AccessToInternet();

    private static List<String> bannedUrl;

    static{
        bannedUrl = new ArrayList<>();
        bannedUrl.add("twiteer.com");
        bannedUrl.add("facebook.com");
        bannedUrl.add("google.com");
    }

    @Override
    public void connectTo(String url) throws Exception {
        if(bannedUrl.contains(url)){
            throw new Exception("URL BLOQUEADA");
        }
        internet.connectTo(url);
    }
    
}

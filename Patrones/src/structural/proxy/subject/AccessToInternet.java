package structural.proxy.subject;

public class AccessToInternet implements Internet{

    @Override
    public void connectTo(String url) throws Exception {
        System.out.println("Conectando a: " + url);
    }
    
}

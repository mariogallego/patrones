package structural.proxy;

import structural.proxy.subject.Internet;

public class App {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("udemy.com");
            internet.connectTo("facebook.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

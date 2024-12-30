package nl.jilderda.rest;

public class GreetingResourceImpl implements HelloResource {
    @Override
    public String getHello() {
        return "Hello from Quarkus REST";
    }
}

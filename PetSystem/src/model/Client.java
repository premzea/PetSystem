//Client.java
package model;

public class Client {

    private String name;
    private String id;

    public Client(String pClient, String id) {
        this.name = pClient;
        this.id = id;
    }

    public String toString(){
        return "{Client name = " + name + ", Client ID = " + id + "}";
    }
}
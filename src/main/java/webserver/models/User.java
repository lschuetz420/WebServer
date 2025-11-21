package webserver.models;

public class User {

    private String id;
    private String name;
    private String email;

    public void setID(){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getID(){
        return id;
    }
}
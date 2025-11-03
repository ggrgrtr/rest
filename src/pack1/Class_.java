package pack1;
// FIO
public class Class_ {
    private String name;
    private String email;
    private char gender;

    public Class_(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getEmail(){
        return email;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String e){
        this.email=e;
    }

    @Override
    public String toString(){
        return "Author: "+name+" "+gender+" "+email;
    }

}

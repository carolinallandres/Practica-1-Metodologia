package es.uah.matcomp.mp.e1.ejerciciosclases.practica_b.a;

public class Author {
    private String name;
    private String email;

    //CONSTRUCTORES

    public Author (String name,String email){
        this.name=name;
        this.email=email;
    }

    //GETTERS

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    //SETTERS

    public void setEmail(String email){
        this.email=email;
    }

    //MÉTODOS

    public String toString(){
        return "Author[name="+name+",email="+email+"]";
    }
}

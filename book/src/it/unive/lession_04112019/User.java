package it.unive.lession_04112019;

public class User implements Comparable<User>{


    private String username;
    private int age;

    public User(String userName,int age){
        if(age<0)
            throw new IllegalArgumentException("Age must be positive");
        this.age=age;
        this.username=userName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User other){

        if(this.age<other.age)
            return -1;
        else if(this.age>other.age)
            return 1;
        else
            return 0;
    }

    public String getUsername() {
        return username;
    }

    public String toString(){
        return "Età: "+this.age+"\n"+"Username: "+this.username;
    }

}

package it.unive.lession_04112019;

import java.util.Collections;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        Vector<User> users = new Vector<User>();
        users.add(new User("Mario", 30));
        users.add(new User("Paolo",28));
        users.add(new User("Emma",4));
        users.add(new User("Maria",60));
        System.out.println("-------------------------");
        UserNameComparator cmp=new UserNameComparator();//interfaccia che viene istanziata per effettuare un confronto, possiede un suo stato
        Collections.sort(users,cmp);
        for(User user: users){
            System.out.println(user);
        }
        System.out.println(cmp.getCounter());

        Object prova=new UserNameComparator();
        ((UserNameComparator)prova).getCounter();

    }
}

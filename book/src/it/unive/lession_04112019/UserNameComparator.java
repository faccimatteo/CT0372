package it.unive.lession_04112019;

import java.util.Comparator;

public class UserNameComparator implements Comparator<User> {

    private int callCounter=0;

    public int getCounter(){
        return this.callCounter;
    }

    public void resetCounter(){
        this.callCounter=0;
    }

    @Override
    public int compare(User u1,User u2){
        callCounter++;
        return u1.getUsername().compareToIgnoreCase(u2.getUsername());
    }

}

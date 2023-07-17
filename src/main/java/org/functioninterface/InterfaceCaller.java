package org.functioninterface;

import org.example.PeopleDetails;

import java.util.ArrayList;

public class InterfaceCaller{

    public static void main(String[] args){

        FunctionInterface<String,PeopleDetails,PeopleDetails> functionInterface= (String s,PeopleDetails p)-> {
            if(s.equals(p.getName())) {
                System.out.println("Found the name:: " + p.getName());
                return p;
            }else{
                return null;
            }
        };

        ArrayList<PeopleDetails> newList=new ArrayList<>();
        PeopleDetails peopleDetails1=new PeopleDetails("Abhinav","Nagpur",10);
        PeopleDetails peopleDetails2=new PeopleDetails("Dan","Danar",12);
        PeopleDetails peopleDetails3=new PeopleDetails("Banzer","Bre",6);
        newList.add(peopleDetails1);
        newList.add(peopleDetails2);
        newList.add(peopleDetails3);

        newList.forEach(p->functionInterface.serchPeopleDetails("Abhinav",p));
    }
}

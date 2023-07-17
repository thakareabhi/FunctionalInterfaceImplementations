package org.consumerinterface;

import org.example.PeopleDetails;

import java.util.ArrayList;

public class InterfaceCaller{

    public static void main(String[] args){

        ConsumerInterface<PeopleDetails> consumerInterface= (PeopleDetails p)-> {
                System.out.println("Print S::" + p.getName());
        };

        ArrayList<PeopleDetails> newList=new ArrayList<>();
        PeopleDetails peopleDetails1=new PeopleDetails("Abhinav","Nagpur",10);
        PeopleDetails peopleDetails2=new PeopleDetails("Dan","Danar",12);
        PeopleDetails peopleDetails3=new PeopleDetails("Banzer","Bre",6);
        newList.add(peopleDetails1);
        newList.add(peopleDetails2);
        newList.add(peopleDetails3);

        newList.forEach(p->consumerInterface.serchPeople(p));
    }
}

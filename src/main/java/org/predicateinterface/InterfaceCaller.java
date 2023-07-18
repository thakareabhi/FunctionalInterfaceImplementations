package org.predicateinterface;

import org.consumerinterface.ConsumerInterface;
import org.example.PeopleDetails;

import java.util.ArrayList;

public class InterfaceCaller {
    public static void main(String[] args){

        PredicateInterface<PeopleDetails> predicateInterface= (PeopleDetails p)-> {
            if(p.getAge()>10){
                System.out.println("Valid Age Access Granted::" + p.getName());
                return true;
            }else {
                System.out.println("InValid Age Access Revoked::" + p.getName());
                return false;
            }
        };

        ArrayList<PeopleDetails> newList=new ArrayList<>();
        PeopleDetails peopleDetails1=new PeopleDetails("Abhinav","Nagpur",10);
        PeopleDetails peopleDetails2=new PeopleDetails("Dan","Danar",12);
        PeopleDetails peopleDetails3=new PeopleDetails("Banzer","Bre",6);
        newList.add(peopleDetails1);
        newList.add(peopleDetails2);
        newList.add(peopleDetails3);

        newList.forEach(  pDetails -> {if(predicateInterface.checkAge(pDetails)){
                System.out.println("Grant Access ticket");
        }else {
            System.out.println("Reject Access ticket");
        }});
    }
}

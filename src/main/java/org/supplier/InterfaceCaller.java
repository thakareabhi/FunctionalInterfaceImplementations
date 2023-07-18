package org.supplier;

import org.example.PeopleDetails;

import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;

public class InterfaceCaller {

    public static void main(String args[]){

        SupplierInterface<Integer> supplierInterface=()->{
          Random r=new Random();
          return r.nextInt();
        };

        ArrayList<PeopleDetails> newList=new ArrayList<>();
        PeopleDetails peopleDetails1=new PeopleDetails("Abhinav","Nagpur",10);
        PeopleDetails peopleDetails2=new PeopleDetails("Dan","Danar",12);
        PeopleDetails peopleDetails3=new PeopleDetails("Banzer","Bre",6);
        newList.add(peopleDetails1);
        newList.add(peopleDetails2);
        newList.add(peopleDetails3);

        ArrayList<Integer> a1=new ArrayList<>();
        newList.forEach(p->{
            System.out.println( supplierInterface.returnAge());
        });

    }

}

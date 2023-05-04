package com.example.seamcrud;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class PeopleBean {

    private List<People> peopleList;

    public PeopleBean() {
        peopleList = new ArrayList<>();
        peopleList.add(new People("Tom", 2, "tom@gmail.com"));
        peopleList.add(new People("Alik", 19, "al@gmail.com"));
        peopleList.add(new People("Dani", 21, "dani@gmail.com"));
    }

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }
    public void addPeople(People people){
        peopleList.add(people);
    }

    public void updatePeople(People people){
        for (int i = 0; i < peopleList.size(); i++) {
            if (peopleList.get(i).getEmail().equals(people.getEmail())) {
                peopleList.set(i, people);
                break;
            }
        }
    }

    public void deletePeople(People people){
//        for (int i = 0; i < peopleList.size(); i++) {
//            if (peopleList.get(i).getEmail().equals(people.getEmail())) {
//                peopleList.remove(people);
//                break;
//            }
//        }
    }
}
package com.dj_learning_dsalgo.lists.doublylinkedlist;

public class PersonNode {

    private Person person;
    private PersonNode next;
    private PersonNode previous;

    public PersonNode getPrevious() {
        return previous;
    }

    public void setPrevious(PersonNode previous) {
        this.previous = previous;
    }

    public PersonNode(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonNode getNext() {
        return next;
    }

    public void setNext(PersonNode next) {
        this.next = next;
    }
}

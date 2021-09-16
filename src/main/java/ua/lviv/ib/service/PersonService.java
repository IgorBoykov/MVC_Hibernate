package ua.lviv.ib.service;

import ua.lviv.ib.model.Person;

import java.util.List;

public interface PersonService {

    public List<Person> getPersonList();

    public void savePerson(Person person);

    public Person getPerson(int id);

    public void deletePerson(int id);
}

package ua.lviv.ib.dao;

import ua.lviv.ib.model.Person;

import java.util.List;

public interface PersonDAO {

    public List<Person> getListOfPersons();

    public void savePerson(Person person);

    public Person getPerson(int id);

    public void deletePerson(int id);
}

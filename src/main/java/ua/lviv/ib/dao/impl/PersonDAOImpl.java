package ua.lviv.ib.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.lviv.ib.dao.PersonDAO;
import ua.lviv.ib.model.Person;

import java.util.List;

@Repository
public class PersonDAOImpl implements PersonDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Person> getListOfPersons() {
        Session session = sessionFactory.getCurrentSession();
        List<Person> listOfPersons = session.createQuery("from Person", Person.class).getResultList();
        return listOfPersons;
    }

    @Override
    public void savePerson(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(person);
    }

    @Override
    public Person getPerson(int id) {
       Session session = sessionFactory.getCurrentSession();
        Person person = session.get(Person.class, id);
        return person;
    }

    @Override
    public void deletePerson(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Person> query = session.createQuery("delete from Person where id =: personId");
        query.setParameter("personId", id);
        query.executeUpdate();
    }
}

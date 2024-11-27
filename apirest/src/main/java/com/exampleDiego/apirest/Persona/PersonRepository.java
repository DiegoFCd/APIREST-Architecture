package com.exampleDiego.apirest.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository   //Se define la interfaz como Repositorio o DAO (Data Acces Object)

public interface PersonRepository extends JpaRepository <Person, Integer>{ //Extiende de JpaRepo y se establece cual es la Entity y el tipo de valor del ID

    //Aca se realizara el CRUD(Eliminar, actulizar, ingresar, borrar,buscar)
    public void createPerson(Person person);

    public List <Person>getPersons();

    public Person searchPersonById(Integer id);

    public void deletePerson(Integer id);

    public Person updatePerson(Integer id, Person personActualizada);

    
}

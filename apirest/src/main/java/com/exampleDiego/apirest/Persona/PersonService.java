package com.exampleDiego.apirest.Persona;

import java.lang.module.ResolutionException;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service //Se espeficica como servicio. Este trabaja con el Controller cuando este reciba una peticion del cliente y deba responderle                    
@RequiredArgsConstructor //Esta anotation de Lombok permite consumir la dependecia del repository para acceder a los metodos
                         //para manipular la base de datos(delete,findByIf,buscar,agregar,etc)


public class PersonService {

    //Ahora se debe hacer la inyeccion de dependecia para que esta clase trabaje con el Repository
    private final PersonRepository personRepo;

    //Aqui se establece los metodos para realizar los CRUD(crear,leer o consultar,actualizar,eliminar)
    
    public void createPerson(Person person){
        personRepo.save(person);
    }
    public List<Person>getPersons(){
        return personRepo.findAll();
    }

    public void searchPersonById(Integer id){
           personRepo.findById(id);
}

    public void deletePerson(Integer id){
        Person person = personRepo.findById(id)
        .orElseThrow(() -> new ResolutionException("Entidad no encontrada con id: " + id));
        personRepo.delete(person);
    }

    public Person updatePerson(Integer id, Person personActualizada) {
        Person person = personRepo.findById(id).orElseThrow(() -> new ResolutionException("Entidad no encontrada con id: " + id));

        // Actualizar los campos necesarios
        person.setName(personActualizada.getName());
        
        return personRepo.save(person);
    }
    


}

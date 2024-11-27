package com.exampleDiego.apirest.Persona;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //Anotacion de Lomobok para consumir la dependencia del Service y permita instanciar
                         //el constructor del Servicio
@RestController         //Se lo define como controlador
//Publicara todos los endpoints o rutas que se ponen a disposicion del cliente para asi manipular el acceso
//a datos o para acceder a alguna funcionalidad de la app

//Este capa de la app o Clase debe enteder el protocolo HTTP por ello se coloca la siguiente annotation:
@RequestMapping("/person")
public class PersonController {
//Se debe ahora inyectar la dependecia del Servicio para acceder a los metodos de dicha clase:

    private final PersonService personService;

    @PostMapping //Aqui identificara el metodo para crear persona cuando desde el lado del cliete se desee crear una nueva persona
    public void createPerson(@RequestBody Person person){  //Los datos vendran en el cuerpo del mensaje
        personService.createPerson(person);
    }
}

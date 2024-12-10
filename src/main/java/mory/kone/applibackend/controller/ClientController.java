package mory.kone.applibackend.controller;

import mory.kone.applibackend.entites.Client;
import mory.kone.applibackend.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;



/*
Le @RestControlleur est utilisé pour marquer une classe
comme un contrôleur qui gère les requêtes
HTTP et renvoie directement des données
structurées (par exemple, JSON ou XML) en réponse à ces requêtes.
*/

/* @RequestMapping peut être utilisé au niveau de la classe ou de la méthode pour définir le chemin de l'URL et d'autres attributs de mapping. */
@RestController
@RequestMapping(path = "client")                        // Toutes les requetes commençant par api/client vont tomber dans cette classe (api a ete defini dans application.properties comme le point de depart)
public class ClientController {

 private ClientService clientservice;

 public ClientController(ClientService clientservice) {
  this.clientservice = clientservice;
 }

 @ResponseStatus(value = HttpStatus.CREATED)             //pour renvoyer un code de reponse ici c'est 201
 @PostMapping(consumes = APPLICATION_JSON_VALUE)        // si on appelle .../api/client la requete va tomber dans cette methode: consumes est ici car post a un body mais pas get
 public void creer(@RequestBody Client client){
  // le @RequestBody precise que le corps de ma requete sera client
  this.clientservice.creer(client);
 }
}

package sn.diakhate.crudapi.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/clients/{id}")
    public Client getClientById(@PathVariable int id) {
        return clientService.getClientById(id);
    }

    @PostMapping("/clients")
    public void getClientById(@RequestBody Client client) {
        clientService.addClient(client);
    }

    @PutMapping("/clients/{id}")
    public void updateClient(@PathVariable int id, @RequestBody Client client) {
        Client toUpdate = clientService.getClientById(id);
        toUpdate.setNom(client.getNom());
        toUpdate.setPrenom(client.getPrenom());
        toUpdate.setDateNaissance(client.getDateNaissance());
        clientService.updateClient(toUpdate);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable int id) {
        clientService.deleteClient(id);
    }

}

package com.capstoneproj.supfinsys.controller;

import com.capstoneproj.supfinsys.models.Client;
import com.capstoneproj.supfinsys.models.Userdto;
import com.capstoneproj.supfinsys.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientRegistrationController {

    @Autowired
    ClientService clientService;
    @PostMapping(path="/registration")
    Client clientRegistration(@RequestBody Client client){
        return clientService.createClient(client);
    }
    
    @PostMapping(path="/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Client login(@RequestBody Userdto user){
	return clientService.login(user);
    }
}
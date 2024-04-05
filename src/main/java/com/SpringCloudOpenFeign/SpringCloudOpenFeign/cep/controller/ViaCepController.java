package com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.controller;


import com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.dto.ViaCepResponse;
import com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consulta-cep")
public class ViaCepController {


    @Autowired
    private ViaCepService service;

    @GetMapping(value = "/{cep}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ViaCepResponse> findCep(@PathVariable String cep){
       ViaCepResponse viaCepResponse  = service.buscaCep(cep);
    return ResponseEntity.ok(viaCepResponse);
    }

}

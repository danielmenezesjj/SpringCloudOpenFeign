package com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.controller;


import com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.dto.ConsultaCnpjResponse;
import com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.dto.ViaCepResponse;
import com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.service.ConsultaCnpjService;
import com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consulta-cnpj")
public class ConsultaCnpjController {


    @Autowired
    private ConsultaCnpjService service;

    @GetMapping(value = "/{cnpj}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ConsultaCnpjResponse> findcnpj(@PathVariable String cnpj){
        ConsultaCnpjResponse consultaCnpjResponse  = service.buscaCnpj(cnpj);
    return ResponseEntity.ok(consultaCnpjResponse);
    }

}

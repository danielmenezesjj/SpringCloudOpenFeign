package com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.service;

import com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.client.ViaCepClient;
import com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.dto.ViaCepResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaCepService {

    @Autowired
    private ViaCepClient client;
    public ViaCepResponse buscaCep(String cep){
        return client.getcep(cep);
    }


}

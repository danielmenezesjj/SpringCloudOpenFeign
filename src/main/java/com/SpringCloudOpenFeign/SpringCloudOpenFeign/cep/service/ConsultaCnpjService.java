package com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.service;

import com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.client.ConsultaCnpjClient;
import com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.dto.ConsultaCnpjResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaCnpjService {

    @Autowired
    private ConsultaCnpjClient service;

    public ConsultaCnpjResponse buscaCnpj(String cnpj){
        return service.getcnpj(cnpj);
    }

}

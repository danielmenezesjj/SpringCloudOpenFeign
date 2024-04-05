package com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.client;


import com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.dto.ConsultaCnpjResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://publica.cnpj.ws/cnpj/", name = "consultacnpj")
public interface ConsultaCnpjClient {


    @GetMapping("{cnpj}")
    ConsultaCnpjResponse getcnpj(@PathVariable String cnpj);

}

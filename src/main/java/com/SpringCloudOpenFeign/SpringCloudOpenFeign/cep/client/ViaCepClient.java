package com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.client;


import com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.dto.ViaCepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface ViaCepClient {
    @GetMapping("/{cep}/json")
    ViaCepResponse getcep(@PathVariable String cep);
}

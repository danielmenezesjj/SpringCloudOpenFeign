package com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViaCepResponse {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ddd;

}

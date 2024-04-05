package com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaCnpjResponse {
    private String cnpj_raiz;
    private String razao_social;
    private String capital_social;
    private Map<String, String> porte;
    private String cnpj_ordem;
    private Map<String, String> natureza_juridica;
    private Map<String, String> qualificacao_do_responsavel;
    private List<Map<String, Object>> socios; // Use Object para permitir objetos aninhados
    private Map<String, String> atividade_principal;
    private Map<String, String> pais;
    private Map<String, String> estado;
    private Map<String, String> cidade;
    private Map<String, String> inscricoes_estaduais;
    private String cnpj_digito_verificador;
    private String tipo;
    private String nome_fantasia;
    private String situacao_cadastral;
    private String data_situacao_cadastral;
    private String data_inicio_atividade;
    private String nome_cidade_exterior;
    private String tipo_logradouro;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cep;
    private String ddd1;
    private String telefone1;
    private String ddd2;
    private String telefone2;
    private String email;
    private String data_situacao_especial;
    private String atualizado_em;
}

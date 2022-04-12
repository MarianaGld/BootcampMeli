package br.com.meli.storage.es.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Document(indexName = "ad") // annotation elastic
public class Ad {

    @Id
    private String id;
    private String code;
    private String title;
    private BigDecimal preco;
    private int stock;
    private List<String> tag;


}

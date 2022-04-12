package br.com.meli.storage.es.repository;

import br.com.meli.storage.es.model.Ad;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdRepository extends ElasticsearchRepository<Ad, String> {
    List<Ad> findByTitle(String title);

}

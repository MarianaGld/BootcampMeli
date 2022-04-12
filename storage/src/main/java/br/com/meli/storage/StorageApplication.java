package br.com.meli.storage;

import br.com.meli.storage.es.model.Ad;
import br.com.meli.storage.es.repository.AdRepository;
import br.com.meli.storage.model.Anuncio;
import br.com.meli.storage.repository.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class StorageApplication implements CommandLineRunner {

	@Autowired
	private AdRepository adRepository;

	public static void main(String[] args) {
		SpringApplication.run(StorageApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<String> tagsFerramentas = Arrays.asList("Ferramenta", "construcao");
	List<String> tagsConstrucao = Arrays.asList("construcao");

		Ad chaveFenda = adRepository.save(Ad.builder().title("chave de fenda")
				.preco(BigDecimal.valueOf(20)).stock(200).tag(tagsFerramentas).build());
		System.out.println("generate id " + chaveFenda.getId());

		Ad chaveInglesa = adRepository.save(Ad.builder().title("chave inglesa")
				.preco(BigDecimal.valueOf(30)).stock(200).tag(tagsFerramentas).build());
		System.out.println("generate id " + chaveInglesa.getId());

		Ad alicate = adRepository.save(Ad.builder().title("alicate")
				.preco(BigDecimal.valueOf(15)).stock(200).tag(tagsFerramentas).build());
		System.out.println("generate id " + alicate.getId());

		Ad parafuso = adRepository.save(Ad.builder().title("parafuso")
				.preco(BigDecimal.valueOf(5)).stock(200).tag(tagsFerramentas).build());
		System.out.println("generate id " + parafuso.getId());

		Ad cimento = adRepository.save(Ad.builder().title("cimento")
				.preco(BigDecimal.valueOf(5)).stock(200).tag(tagsConstrucao).build());
		System.out.println("generate id " + cimento.getId());


		adRepository.findByTitle("chave").forEach(ad -> System.out.println(ad.getTitle()));
	}
}

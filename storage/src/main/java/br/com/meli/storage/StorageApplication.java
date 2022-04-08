package br.com.meli.storage;

import br.com.meli.storage.model.Anuncio;
import br.com.meli.storage.model.repository.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class StorageApplication implements CommandLineRunner {

	@Autowired
	private AnuncioRepository anuncioRepository;

	public static void main(String[] args) {
		SpringApplication.run(StorageApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Anuncio anuncio = Anuncio.builder().data(LocalDate.now())
				.preco(new BigDecimal(200)).titulo("toalha de banho").build();
		anuncioRepository.save(anuncio);
	}
}

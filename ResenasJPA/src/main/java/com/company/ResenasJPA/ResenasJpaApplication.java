package com.company.ResenasJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ResenasJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(ResenasJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ResenasJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demostracion(RepositorioUsuario repositorioUsuario) {
		return (args) -> {
			repositorioUsuario.save(new Usuario("Juan", "Naranjo"));
			repositorioUsuario.save(new Usuario("Leidy", "Rios"));
			repositorioUsuario.save(new Usuario("Luz", "Ochoa"));
			repositorioUsuario.save(new Usuario("Martin", "Restrepo"));
			repositorioUsuario.save(new Usuario("Daniel", "Moncada"));

			log.info("Usuario encontrado con findAll():");
			log.info("---------------------------------");
			repositorioUsuario.findAll().forEach(usuario -> {
				log.info(usuario.toString());
			});
			log.info("");

			Usuario usuario = repositorioUsuario.findById(1L);
			log.info("Usuario encontrado con findById(1L):");
			log.info("---------------------------------");
			log.info(usuario.toString());
			log.info("");

			log.info("Usuario encontrado con findByApellido('Naranjo')");
			log.info("---------------------------------");
			repositorioUsuario.findByApellido("Naranjo").forEach(naranjo -> {
				log.info(naranjo.toString());
			});
			log.info("");
		};
	}

}

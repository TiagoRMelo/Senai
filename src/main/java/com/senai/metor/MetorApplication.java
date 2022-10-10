package com.senai.metor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.senai.metor.Repositories.EstacaoRespository;
//import com.senai.metor.domain.Estacao;

@SpringBootApplication
public class MetorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetorApplication.class, args);
	}

@Bean
public CommandLineRunner demo(EstacaoRespository EstRep){
	return (args) -> {
		//Estacao estacao1 = new Estacao(1,"estacaoP","Blumenau","Tiago");
		///Estacao estacao2 = new Estacao(2,"estacaoM","Jaragua","Tiago");
		//EstRep.save(new Estacao(null,"estacaoM","Jaragua","Tiago");
		//EstRep.save(estacao1);
		//EstRep.save(estacao2);
		/*EstRep.save(new Funcionario(null, "tiago", depto2));
        funcRep.save(new Funcionario(null, "Pedro", depto2));
        funcRep.save(new Funcionario(null, "Marcio", depto2));
        funcRep.save(new Funcionario(null, "yuriAtraso", depto2));
        funcRep.save(new Funcionario(null, "sergio", depto2));*/
	};
}
}

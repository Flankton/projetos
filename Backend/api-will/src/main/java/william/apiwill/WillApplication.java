package william.apiwill;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;

//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import william.apiwill.Model.UsuarioModel;
import william.apiwill.Repository.UsuarioRepository;

import java.util.Collections;
import java.util.stream.Stream;



@SpringBootApplication
public class WillApplication {

	public static void main(String[] args) {
		SpringApplication.run(WillApplication.class, args);
	}


	// Bootstrap some test data into the in-memory database
//	@Bean
//	ApplicationRunner init(UsuarioRepository repository) {
//		return args -> {
//			Stream.of("Buy milk", "Eat pizza", "Write tutorial", "Study Vue.js", "Go kayaking").forEach(name -> {
//				UsuarioModel usuario = new UsuarioModel();
//				usuario.setName(name);
//				repository.save(usuario);
//			});
//			repository.findAll().forEach(System.out::println);
//		};
//	}
	// Fix the CORS errors
//	@Bean
//	public FilterRegistrationBean simpleCorsFilter() {
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		CorsConfiguration config = new CorsConfiguration();
//		config.setAllowCredentials(true);
//		// *** URL below needs to match the Vue client URL and port ***
//		config.setAllowedOrigins(Collections.singletonList("http://localhost:8080"));
//		config.setAllowedMethods(Collections.singletonList("*"));
//		config.setAllowedHeaders(Collections.singletonList("*"));
//		source.registerCorsConfiguration("/**", config);
//		FilterRegistrationBean bean = new FilterRegistrationBean<>(new CorsFilter(source));
//		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
//		return bean;
	//}
}
package config;

import service.FournisseurService;
import service.IFournisseurService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public IFournisseurService fournisseurService() {
        return new FournisseurService();
    }
}

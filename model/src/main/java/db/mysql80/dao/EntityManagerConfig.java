package db.mysql80.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
public class EntityManagerConfig {

    @Autowired
    DatabaseConfiguration databaseConfiguration;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(databaseConfiguration.dataSource());
        factoryBean.setPackagesToScan("com.dbmon.domain.db.mysql80");
    }
}

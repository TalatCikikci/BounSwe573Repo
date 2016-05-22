package bucoop.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.mvc.Controller;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "bucoop")
public class RootConfig {

    @Bean
    public DataSource springJpaDataSource() {
        final JndiDataSourceLookup lookup = new JndiDataSourceLookup();
        final DataSource dataSource = lookup.getDataSource("jdbc/bucoopdb");
        return dataSource;
    }

    @Bean
    // factory bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        final LocalContainerEntityManagerFactoryBean factory =
                new LocalContainerEntityManagerFactoryBean();
        factory.setPersistenceXmlLocation("classpath:/META-INF/persistence.xml");
        factory.setPersistenceUnitName("bucoop_BuCoopApplication_war_1.0-SNAPSHOTPU");
        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        factory.setDataSource(this.springJpaDataSource());
        return factory;
    }

    @Bean
    public PlatformTransactionManager jpaTransactionManager() {
        final EntityManagerFactory emf = entityManagerFactoryBean().getObject();
        final JpaTransactionManager jpaTransactionManager = new JpaTransactionManager(emf);
        jpaTransactionManager.setPersistenceUnitName("bucoopdb");
        return jpaTransactionManager;
    }

}

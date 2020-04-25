package dbmon.gather.multitenant;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Properties;

import static java.lang.String.format;

@Slf4j
@Component
@RequiredArgsConstructor
public class TenantDataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private final MultiTenantManager tenantManager;

    @SneakyThrows(IOException.class)
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("ApplicationListener onApplicationEvent Start!");
        //this.tenantManager.setTenantResolver(TenantDataLoader::tenantResolver);

        File[] files = Paths.get("tenants/onStartUp").toFile().listFiles();

        if (files == null) {
            log.warn("[!] Tenant property files not found at ./tenants/onStartUp folder!");
            return;
        }

        for (File propertyFile : files) {
            Properties tenantProperties = new Properties();
            tenantProperties.load(new FileInputStream(propertyFile));

            String tenantId = tenantProperties.getProperty("id");
            String url = tenantProperties.getProperty("url");
            String driverClassName = tenantProperties.getProperty("driverClassName");
            String username = tenantProperties.getProperty("username");
            String password = tenantProperties.getProperty("password");

            try {
                tenantManager.addTenant(tenantId, url, driverClassName, username, password);
                log.info("[i] Loaded DataSource for tenant '{}'.", tenantId);
            } catch (SQLException e) {
                log.error(format("[!] Could not load DataSource for tenant '%s'!", tenantId), e);
            }
        }
    }
    /**
     * Load tenant datasource properties from the folder 'tenants/onStartUp`
     * when the app has started.
     */
    @EventListener
    public void onReady(ApplicationReadyEvent event) {
        log.info("EventListener onReadyStart!");
    }
//
//    /**
//     * Example of the tenant resolver - load the given tenant datasource properties
//     * from the folder 'tenants/atRuntime'
//     *
//     * @param tenantId tenant id
//     * @return tenant DataSource
//     */
//    private static DataSourceProperties tenantResolver(String tenantId) {
//
//        File[] files = Paths.get("tenants/atRuntime").toFile().listFiles();
//
//        if (files == null) {
//            String msg = "[!] Tenant property files not found at ./tenants/atRuntime folder!";
//            log.error(msg);
//            throw new RuntimeException(msg);
//        }
//
//        for (File propertyFile : files) {
//            Properties tenantProperties = new Properties();
//            try {
//                tenantProperties.load(new FileInputStream(propertyFile));
//            } catch (IOException e) {
//                String msg = "[!] Could not read tenant property file at ./tenants/atRuntime folder!";
//                log.error(msg);
//                throw new RuntimeException(msg, e);
//            }
//
//            String id = tenantProperties.getProperty("id");
//            if (tenantId.equals(id)) {
//                DataSourceProperties properties = new DataSourceProperties();
//                properties.setUrl(tenantProperties.getProperty("url"));
//                properties.setUsername(tenantProperties.getProperty("username"));
//                properties.setPassword(tenantProperties.getProperty("password"));
//                return properties;
//            }
//        }
//        String msg = "[!] Any tenant property files not found at ./tenants/atRuntime folder!";
//        log.error(msg);
//        throw new RuntimeException(msg);
//    }
}

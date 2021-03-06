package dbmon.gather.multitenant.controller;

import dbmon.gather.multitenant.MultiTenantManager;
import dbmon.gather.multitenant.exception.InvalidDbPropertiesException;
import dbmon.gather.multitenant.exception.LoadDataSourceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/tenants")
public class TenantController {

	private final MultiTenantManager tenantManager;
	
	public TenantController(MultiTenantManager tenantManager) {
		this.tenantManager = tenantManager;
	}

	/**
	 * Get list of all tenants in the local storage
	 */
	@GetMapping
	public ResponseEntity<?> getAll() {
		// TODO health check 제공
		return ResponseEntity.ok(tenantManager.getTenantList());
	}

	// TODO remove tenant

	/**
	 * Add the new tenant on the fly
	 *
	 * @param dbProperty Map with tenantId and related datasource properties
	 */
	@PostMapping
	public ResponseEntity<?> add(@RequestBody Map<String, String> dbProperty) {
		
		log.info("[i] Received add new tenant params request {}", dbProperty);
		
		String tenantId = dbProperty.get("tenantId");
		String url = dbProperty.get("url");
		String driverClassName  = dbProperty.get("driverClassName");
		String username = dbProperty.get("username");
		String password = dbProperty.get("password");
		
		if (tenantId == null || url == null || username == null || password == null) {
			log.error("[!] Received database params are incorrect or not full!");
			throw new InvalidDbPropertiesException();
		}
		
		try {
			tenantManager.addTenant(tenantId, url, driverClassName, username, password);
			log.info("[i] Loaded DataSource for tenant '{}'.", tenantId);
			return ResponseEntity.ok(dbProperty);
		} catch (SQLException e) {
			throw new LoadDataSourceException(e);
		}
	}

	// TODO remove tenants on the fly
}

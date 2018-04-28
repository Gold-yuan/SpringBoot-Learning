package com.didispace.prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "com.didispace")
@Component
public class FooPropertie {

    private String foo;

    private String databasePlatform;

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}

	public String getDatabasePlatform() {
		return databasePlatform;
	}

	public void setDatabasePlatform(String databasePlatform) {
		this.databasePlatform = databasePlatform;
	}

    
}
plugins {
	java
	id("org.springframework.boot") version "2.1.3.RELEASE"	
	id("io.spring.dependency-management") version "1.0.7.RELEASE"
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-jdbc")

	implementation("org.postgresql:postgresql:42.2.5")
}

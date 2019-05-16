package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient   //也可以用EnableDiscoveryClient代替，前者兼容性更大，后者仅能兼容Eureka
public class ServerProvider {
	public static void main(String[] args) {
        SpringApplication.run(ServerProvider.class, args);
    }
}

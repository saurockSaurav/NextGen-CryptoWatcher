package com.next.crypto.watcher;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

//import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigurationProperties
@EnableCaching
//@Slf4j
public class CryptoWatcherApplication {

	public static void main(String[] args) {
		
		final long methodStartTime = System.currentTimeMillis();
		//log.info(MessageFormat.format("Main method started at :{0}", methodStartTime));
		SpringApplication.run(CryptoWatcherApplication.class, args);
		//log.info(MessageFormat.format("Total time taken for {0}", System.currentTimeMillis() - methodStartTime));
	}

}

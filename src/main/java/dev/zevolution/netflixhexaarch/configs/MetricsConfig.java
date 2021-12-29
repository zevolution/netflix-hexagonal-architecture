package dev.zevolution.netflixhexaarch.configs;

import io.micrometer.prometheus.PrometheusMeterRegistry;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnBean(PrometheusMeterRegistry.class)
public class MetricsConfig {

  @Bean
  InitializingBean forcePrometheusPostProcessor(BeanPostProcessor meterRegistryPostProcessor, PrometheusMeterRegistry registry) {
    return () -> meterRegistryPostProcessor.postProcessAfterInitialization(registry, "");
  }

}

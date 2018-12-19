package com.example.reactivepets.domain.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.function.DatabaseClient;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;

@Configuration
public class DbConfig {
    @Bean
    public DatabaseClient databaseClient() {
        final PostgresqlConnectionFactory connectionFactory =
            new PostgresqlConnectionFactory(PostgresqlConnectionConfiguration.builder()
                .host("localhost")
                .port(5432)
                .database("postgres")
                .username("postgres")
                .password("postgres")
                .build());

        return DatabaseClient.create(connectionFactory);
    }
}

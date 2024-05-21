package com.pxp.kubernetesdemomay2024;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

@RestController
public class KubeController {

    @Bean
    public RouterFunction<ServerResponse> endpoints() {
        return RouterFunctions
                .route()
                .GET("/greet", request -> ServerResponse.ok()
                        .body(new ResponseEntity<String>("Hello Kubernetes!", HttpStatus.OK)))
                .build();
    }
}

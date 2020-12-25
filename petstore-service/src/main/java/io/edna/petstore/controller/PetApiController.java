package io.edna.petstore.controller;

import io.edna.petstore.service.generated.controller.PetApi;
import io.edna.petstore.service.generated.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Controller
public class PetApiController implements PetApi {

    @Override
    public Mono<ResponseEntity<Pet>> getPetById(Long petId, ServerWebExchange exchange) {
        return Mono.just(ResponseEntity.ok(new Pet().id(petId).name("Steve")));
    }

}

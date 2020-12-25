package io.edna.petstore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.edna.petstore.api.client.ApiClient;
import io.edna.petstore.api.client.apis.PetApi;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AppTests {

    @LocalServerPort
    private int port;

    @Test
    void contextLoads() {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setBasePath(String.format("http://localhost:%d", port));

        PetApi apiInstance = new PetApi(defaultClient);

        assertEquals("Steve", apiInstance.getPetById(0L).block().getName());
    }

}

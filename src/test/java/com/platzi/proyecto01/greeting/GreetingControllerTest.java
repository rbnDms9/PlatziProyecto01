package com.platzi.proyecto01.greeting;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class GreetingControllerTest {

    @Test
    void returnsGreetingAsJson() throws Exception {
        GreetingService greetingService = mock(GreetingService.class);
        when(greetingService.greet()).thenReturn("Hola, mundo!");
        MockMvc mockMvc = MockMvcBuilders
                .standaloneSetup(new GreetingController(greetingService))
                .build();

        mockMvc.perform(get("/api/saludo"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.mensaje").value("Hola, mundo!"));

        verify(greetingService).greet();
    }
}

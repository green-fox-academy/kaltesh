package iamgroot.grrotiam.controllers;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GuardianController.class)
class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void givenMessage_statusIsOk() throws Exception {
    mockMvc.perform(get("/groot?message=something")).andExpect(status().isOk());
  }

  @Test
  public void givenMessage_responseIsAsExpected() throws Exception {
    mockMvc.perform(get("/groot?message=anyuuu")).andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("anyuuu")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void givenNoMessage_statusIsNotOk() throws Exception {
    mockMvc.perform(get("/groot")).andExpect(status().isBadRequest());
  }


  @Test
  public void givenNoMessage_errorMessageIsAsExpected() throws Exception {
    mockMvc.perform(get("/groot")).andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void givenParameters_statusIsOk() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.00&time=10.00")).andExpect(status().isOk());
  }

  @Test
  public void givenParameters_responseIsAsExpected() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.00&time=10.00")).andExpect(status().isOk())
        .andExpect(jsonPath("$.distance", is(100.00)))
        .andExpect(jsonPath("$.time", is(10.00)))
        .andExpect(jsonPath("$.speed", is(10.00)));
  }

  @Test
  public void givenNoParameters_statusIsNotOk() throws Exception {
    mockMvc.perform(get("/yondu")).andExpect(status().isBadRequest());
  }

  @Test
  public void givenNoParameters_errorMessageIsAsExpected() throws Exception {
    mockMvc.perform(get("/yondu")).andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("Forgot something?")));
  }

}
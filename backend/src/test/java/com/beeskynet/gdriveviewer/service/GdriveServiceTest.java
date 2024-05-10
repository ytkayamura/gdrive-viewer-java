package com.beeskynet.gdriveviewer.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.beeskynet.gdriveviewer.dto.Greeting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GdriveServiceTest {

  @Autowired private GdriveService gdriveService;

  @Test
  void testMap() {
    Map<String, String> expectedMap = new HashMap<>();
    expectedMap.put("message", "hello world.");

    Map<String, String> actualMap = gdriveService.map();

    assertNotNull(actualMap);
    assertEquals(expectedMap, actualMap);
  }

  @Test
  void testGreeting() {
    List<Greeting> expectedGreetings = new ArrayList<>();
    expectedGreetings.add(new Greeting("Taro", "hello", 14));
    expectedGreetings.add(new Greeting("Hanako", "hello world", 16));

    List<Greeting> actualGreetings = gdriveService.greeting();

    assertNotNull(actualGreetings);
    assertEquals(expectedGreetings, actualGreetings);
  }
}

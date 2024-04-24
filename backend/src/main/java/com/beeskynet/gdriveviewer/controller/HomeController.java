package com.beeskynet.gdriveviewer.controller;

import com.beeskynet.gdriveviewer.dto.Greeting;
import com.beeskynet.gdriveviewer.service.GdriveService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

  @Autowired GdriveService gdriveService;

  @GetMapping()
  Map<String, String> home() {
    return gdriveService.map();
  }

  @GetMapping("/greeting")
  List<Greeting> greeting() {
    return gdriveService.greeting();
  }
}

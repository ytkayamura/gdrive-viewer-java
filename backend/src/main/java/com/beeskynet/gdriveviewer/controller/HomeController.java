package com.beeskynet.gdriveviewer.controller;

import com.beeskynet.gdriveviewer.service.GdriveService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

  @Autowired GdriveService gdriveService;

  @RequestMapping()
  Map<String, String> home() {
    return gdriveService.map();
  }

  @RequestMapping(path = "/greeting")
  Map<String, String> piyo() {
    return gdriveService.greeting();
  }
}

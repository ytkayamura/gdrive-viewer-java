package com.beeskynet.gdriveviewer.service;

import com.beeskynet.gdriveviewer.dto.Greeting;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class GdriveService {
  public Map<String, String> map() {
    HashMap<String, String> map = new HashMap<>();
    map.put("message", "hello world.");
    return map;
  }

  public Greeting greeting() {
    return new Greeting("Taro", "hello", 14);
  }
}

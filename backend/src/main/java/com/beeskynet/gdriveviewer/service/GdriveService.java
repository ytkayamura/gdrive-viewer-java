package com.beeskynet.gdriveviewer.service;

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

  public Map<String, String> greeting() {
    HashMap<String, String> map = new HashMap<>();
    map.put("name", "Taro");
    map.put("message", "hello");
    return map;
  }
}

package com.beeskynet.gdriveviewer.service;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class GdriveService {
  public Map<String, String> map() {
    HashMap<String, String> map = new HashMap<>();
    map.put("key", "value");
    map.put("foo", "bar");
    map.put("aa", "bb");
    return map;
  }

  public String piyo() {
    return "piyo";
  }
}

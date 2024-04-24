package com.beeskynet.gdriveviewer.service;

import com.beeskynet.gdriveviewer.dto.Greeting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class GdriveService {
  public Map<String, String> map() {
    HashMap<String, String> map = new HashMap<>();
    map.put("message", "hello world.");
    return map;
  }

  public List<Greeting> greeting() {
    List<Greeting> res = new ArrayList<>();
    res.add(new Greeting("Taro", "hello", 14));
    res.add(new Greeting("Hanako", "hello world", 16));
    return res;
  }
}

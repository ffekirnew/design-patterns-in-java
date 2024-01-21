package me.fikernewbirhanu.designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
  final private Map<String, Object> settings = new HashMap<String, Object>();
  private static ConfigManager instance = new ConfigManager();

  private ConfigManager() {
  }

  public Object getSetting(String settingName) {
    return settings.get(settingName);
  }

  public void setSetting(String settingName, Object settingObject) {
    this.settings.put(settingName, settingObject);
  }

  public static ConfigManager getInstance() {
    return instance;
  }
}

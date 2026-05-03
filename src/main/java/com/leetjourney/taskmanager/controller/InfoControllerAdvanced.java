package com.leetjourney.taskmanager.controller;

import com.leetjourney.taskmanager.config.AppProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/info-advanced")
public class InfoControllerAdvanced {

    private final AppProperties appProperties;

    public InfoControllerAdvanced(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @GetMapping
    public Map<String, Object> getAppInfo() {
        Map<String, Object> infoMap = new HashMap<>();
        infoMap.put("appName", appProperties.getName());
        infoMap.put("appVersion", appProperties.getVersion());
        infoMap.put("maxTasksPerPage", appProperties.getMaxTasksPerPage());
        return infoMap;
    }
}

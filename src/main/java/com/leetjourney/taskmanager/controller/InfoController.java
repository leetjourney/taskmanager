package com.leetjourney.taskmanager.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/info")
public class InfoController {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.max-tasks-per-page}")
    private int maxTasksPerPage;

    @GetMapping
    public Map<String, Object> getAppInfo() {
        Map<String, Object> infoMap = new HashMap<>();
        infoMap.put("appName", appName);
        infoMap.put("appVersion", appVersion);
        infoMap.put("maxTasksPerPage", maxTasksPerPage);
        return infoMap;
    }
}

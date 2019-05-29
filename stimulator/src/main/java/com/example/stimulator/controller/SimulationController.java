package com.example.stimulator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SimulationController {
    Map<String, Object> res;
    @PostMapping("/get")
    public Map<String, Object> simulate(@RequestBody Map<String, Object> req){
        Integer width = (Integer) req.get("width");
        Integer height = (Integer) req.get("height");
        Integer steps = (Integer) req.get("steps");
        List<List<Integer>> initialBoard = (List<List<Integer>>) req.get("board");
        return res;
    }
}

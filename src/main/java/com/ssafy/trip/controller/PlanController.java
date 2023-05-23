package com.ssafy.trip.controller;

import com.ssafy.trip.dto.plan.PlanRegisterDTO;
import com.ssafy.trip.service.plan.PlanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plan")
@RequiredArgsConstructor
@Slf4j
public class PlanController {

    private final PlanService planService;

    @PostMapping
    public ResponseEntity registerPlan(@RequestBody PlanRegisterDTO dto) {
        System.out.println(dto);
        planService.save(dto);
        return ResponseEntity.ok().build();
    }
}
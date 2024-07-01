package com.skillmatch.backend.controller;

import com.skillmatch.backend.service.IKpiService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kpi")
@RequiredArgsConstructor
public class KpiController {
    private final IKpiService kpiService;

    @GetMapping("/contratante")
    public double getTempoDeRespostaCriacaoDeContratante(){
        return kpiService.getTempoDeRespostaCriacaoDeContratante();
    }

    @GetMapping("/freelancer")
    public double getTempoDeRespostaCriacaoDeFreelancer(){
        return kpiService.getTempoDeRespostaCriacaoDeFreelancer();
    }

    @GetMapping("/projeto")
    public double getTempoDeRespostaCriacaoDeProjeto(){
        return kpiService.getTempoDeRespostaCriacaoDeProjeto();
    }

}

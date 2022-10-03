package it.contrader.controller;

import it.contrader.dto.ProfiloDTO;
import it.contrader.model.Profilo;
import it.contrader.service.ProfiloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GestioneProfilo {

    @Autowired
    ProfiloService service;

    @GetMapping("/profiles")
    public List<ProfiloDTO> getProfili(){
        return service.getProfili();
    }

    @GetMapping("/profiliById")
    public List<ProfiloDTO> getByCF(@RequestParam String CF){
        List<ProfiloDTO> list = getProfili();
        return list.stream().filter(x -> x.getCodiceFiscale().equals(CF)).collect(Collectors.toList());
    }

    @PostMapping("/insertProfilo")
    public ProfiloDTO insertProfilo(@RequestBody Profilo profilo){
        return service.insert(profilo);
    }

}

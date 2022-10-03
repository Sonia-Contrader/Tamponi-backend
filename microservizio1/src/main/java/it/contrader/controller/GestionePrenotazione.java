package it.contrader.controller;

import it.contrader.dto.PrenotazioneDTO;
import it.contrader.model.Prenotazione;
import it.contrader.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GestionePrenotazione {

    @Autowired
    PrenotazioneService service;

    @GetMapping("/prenotations")
    public List<PrenotazioneDTO> getPrenotazioni (){
        return service.getAllPrenotazioni();
    }

    @GetMapping("/prenotationByDay")
    public List<PrenotazioneDTO> getByDay(LocalDate date){
        List<PrenotazioneDTO> list = getPrenotazioni();
        return list.stream().filter(x-> x.getDataPrenotazione().equals(date)).collect(Collectors.toList());
    }

    @PostMapping("/insertPrenotation")
    public PrenotazioneDTO insertPrenotazione(@RequestBody Prenotazione prenotazione){
        return service.insertPrenotazione(prenotazione);
    }

    @DeleteMapping("/deletePrenotation")
    public void deletePrenotazione(long id){
        service.deletePrenotazione(id);
    }

}

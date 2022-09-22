package it.contrader.service;

import it.contrader.dao.PrenotazioneRepository;
import it.contrader.dto.PrenotazioneDTO;
import it.contrader.mapper.PrenotazioneMapper;
import it.contrader.model.Prenotazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioneService {

    PrenotazioneMapper prenotazioneMapper = PrenotazioneMapper.INSTANCE;

    @Autowired
    PrenotazioneRepository prenotazioneRepository;

    public List<PrenotazioneDTO> getAllPrenotazioni(){
        return prenotazioneMapper.toPrenotazioneList((List<Prenotazione>) prenotazioneRepository.findAll());
    }

    public PrenotazioneDTO insertPrenotazione(Prenotazione prenotazione){
        return prenotazioneMapper.toPrenotazione(prenotazioneRepository.save(prenotazione));
    }

    public void deletePrenotazione(long id){
        prenotazioneRepository.deleteById(id);
    }
}

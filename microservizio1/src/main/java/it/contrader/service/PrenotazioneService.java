package it.contrader.service;

import it.contrader.dao.PrenotazioneRepository;
import it.contrader.mapper.PrenotazioneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {

    PrenotazioneMapper prenotazioneMapper = PrenotazioneMapper.INSTANCE;

    @Autowired
    PrenotazioneRepository prenotazioneRepository;
}

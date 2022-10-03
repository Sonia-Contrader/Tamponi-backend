package it.contrader.service;

import it.contrader.dao.ProfiloRepository;
import it.contrader.dto.ProfiloDTO;
import it.contrader.mapper.ProfiloMapper;
import it.contrader.model.Profilo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfiloService {

    ProfiloMapper profiloMapper = ProfiloMapper.INSTANCE;

    @Autowired
    ProfiloRepository profiloRepository;

    public void deleteProfilo(Profilo profilo){
        profiloRepository.delete(profilo);
    }

    public List<ProfiloDTO> getProfili(){
        return profiloMapper.toProfileList((List<Profilo>) profiloRepository.findAll());
    }

    public ProfiloDTO insert(Profilo profilo){
        return profiloMapper.toUser(profiloRepository.save(profilo));
    }

    public ProfiloDTO update(Profilo profilo){
        return profiloMapper.toUser(profiloRepository.save(profilo));
    }

}

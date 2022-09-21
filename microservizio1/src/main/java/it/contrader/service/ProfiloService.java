package it.contrader.service;

import it.contrader.dao.ProfiloRepository;
import it.contrader.mapper.ProfiloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfiloService {

    ProfiloMapper profiloMapper = ProfiloMapper.INSTANCE;

    @Autowired
    ProfiloRepository profiloRepository;
}

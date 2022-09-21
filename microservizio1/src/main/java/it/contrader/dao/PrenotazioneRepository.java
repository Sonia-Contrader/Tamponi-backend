package it.contrader.dao;

import it.contrader.model.Prenotazione;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Long> {

}

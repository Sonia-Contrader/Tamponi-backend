package it.contrader.mapper;

import it.contrader.dto.PrenotazioneDTO;
import it.contrader.model.Prenotazione;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PrenotazioneMapper {

    PrenotazioneMapper INSTANCE = Mappers.getMapper(PrenotazioneMapper.class);

    Prenotazione toUser (PrenotazioneDTO prenotazioneDTO);
    PrenotazioneDTO toUser(Prenotazione prenotazione);

}

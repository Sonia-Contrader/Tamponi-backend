package it.contrader.mapper;

import it.contrader.dto.PrenotazioneDTO;
import it.contrader.model.Prenotazione;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PrenotazioneMapper {

    PrenotazioneMapper INSTANCE = Mappers.getMapper(PrenotazioneMapper.class);

    Prenotazione toPrenotazione (PrenotazioneDTO prenotazioneDTO);
    PrenotazioneDTO toPrenotazione(Prenotazione prenotazione);
    List<PrenotazioneDTO> toPrenotazioneList(List<Prenotazione> prenotazione);

}

package it.contrader.mapper;

import it.contrader.dto.ProfiloDTO;
import it.contrader.model.Profilo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProfiloMapper {

    ProfiloMapper INSTANCE = Mappers.getMapper(ProfiloMapper.class);

    Profilo toUser (ProfiloDTO profilo);
    ProfiloDTO toUser (Profilo profilo);

    List<ProfiloDTO> toProfileList(List<Profilo> profiloDTOS);
}

package it.contrader.dto;

import it.contrader.model.Profilo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrenotazioneDTO {

    private long id;
    private LocalDate dataPrenotazione;
    private ProfiloDTO codiceFiscale;
}

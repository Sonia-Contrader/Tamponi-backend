package it.contrader.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Profilo {

    @Id
    @Column(unique = true)
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private String luogoDiNascita;
    private LocalDate dataDiNascita;

    @Column(unique = true)
    private String numeroCI;


}

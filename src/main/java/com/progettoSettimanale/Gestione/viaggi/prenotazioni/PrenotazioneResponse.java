package com.progettoSettimanale.Gestione.viaggi.prenotazioni;

import com.progettoSettimanale.Gestione.viaggi.dipendenti.Dipendente;
import com.progettoSettimanale.Gestione.viaggi.viaggi.Viaggio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class PrenotazioneResponse {

    private long id;
  private String note;
    private LocalDate dateStart;

    private Viaggio viaggio;

    private Dipendente dipendente;

}

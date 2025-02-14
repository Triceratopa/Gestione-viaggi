package com.progettoSettimanale.Gestione.viaggi.prenotazioni;

import com.progettoSettimanale.Gestione.viaggi.dipendenti.Dipendente;
import com.progettoSettimanale.Gestione.viaggi.viaggi.Viaggio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class PrenotazioneRequest {
    private String note;
    private LocalDate dateStart;
    private Viaggio viaggio;
    private Dipendente dipendente;
    private long dipendenteId;
    private long viaggioId;
}

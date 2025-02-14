package com.progettoSettimanale.Gestione.viaggi.viaggi;

import com.progettoSettimanale.Gestione.viaggi.stato.StatoViaggio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ViaggioRequest {
    private String destinazione;
    private LocalDate date;
    private StatoViaggio statoViaggio;

}

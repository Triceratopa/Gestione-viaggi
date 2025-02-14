package com.progettoSettimanale.Gestione.viaggi.viaggi;

import com.progettoSettimanale.Gestione.viaggi.stato.StatoViaggio;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Viaggio {
    @Id
    @GeneratedValue
    private long id;

    private String destinazione;
    private LocalDate date;
    StatoViaggio statoViaggio;

}

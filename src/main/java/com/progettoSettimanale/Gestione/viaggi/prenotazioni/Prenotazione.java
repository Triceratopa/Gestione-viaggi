package com.progettoSettimanale.Gestione.viaggi.prenotazioni;

import com.progettoSettimanale.Gestione.viaggi.dipendenti.Dipendente;
import com.progettoSettimanale.Gestione.viaggi.viaggi.Viaggio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String note;
    private LocalDate dateStart = LocalDate.now();
    @ManyToOne
    private Viaggio viaggio;
    @ManyToOne
    private Dipendente dipendente;}
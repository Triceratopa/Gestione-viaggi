package com.progettoSettimanale.Gestione.viaggi.dipendenti;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dipendente {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String nome;
    private String cognome;
    private String email;
}

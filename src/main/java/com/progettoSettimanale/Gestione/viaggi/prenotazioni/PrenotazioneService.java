package com.progettoSettimanale.Gestione.viaggi.prenotazioni;

import com.progettoSettimanale.Gestione.viaggi.dipendenti.DipendenteRepository;
import com.progettoSettimanale.Gestione.viaggi.email.Email;
import com.progettoSettimanale.Gestione.viaggi.viaggi.ViaggioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@RequiredArgsConstructor
@Validated
public class PrenotazioneService {
    private final PrenotazioneRepository prenotazioneRepository;
    private final ViaggioRepository viaggioRepository;
    private final DipendenteRepository dipendenteRepository;
    private final Email email;







}

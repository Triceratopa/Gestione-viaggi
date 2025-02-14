package com.progettoSettimanale.Gestione.viaggi.dipendenti;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/dipendente")
@RequiredArgsConstructor
public class DipendenteController {
    private final DipendenteService dipendenteService;
}

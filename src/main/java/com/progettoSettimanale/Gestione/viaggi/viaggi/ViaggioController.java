package com.progettoSettimanale.Gestione.viaggi.viaggi;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/viaggi")
@RequiredArgsConstructor
public class ViaggioController {
    private final ViaggioService viaggioService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ViaggioResponse> findAll() {
        return viaggioService.findAll();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ViaggioResponse findTravelResponseFromId(Long id) {
        return viaggioService.findTravelResponseFromId(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateResponse save(@Valid @RequestBody ViaggioRequest viaggioRequest) {
        return viaggioService.save(viaggioRequest);
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ViaggioResponse modify(@PathVariable Long id, @Valid @RequestBody ViaggioRequest viaggioRequest) {
        return viaggioService.modify(id, viaggioRequest);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        viaggioService.delete(id);
    }
}

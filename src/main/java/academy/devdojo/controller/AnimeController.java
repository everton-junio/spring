package academy.devdojo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v2")
public class AnimeController {
    @GetMapping("animes")
    public List<String> listarAnimes(){
        log.info("Recived a request to /v2/animes");
        return List.of("Jujutsu","One Piece", "Kimetsu");
    }
}

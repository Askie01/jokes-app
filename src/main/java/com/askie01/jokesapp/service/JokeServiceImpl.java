package com.askie01.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

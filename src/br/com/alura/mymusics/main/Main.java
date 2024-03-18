package br.com.alura.mymusics.main;

import br.com.alura.mymusics.models.Music;
import br.com.alura.mymusics.models.MyFavorites;
import br.com.alura.mymusics.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music music = new Music();
        music.setTitle("Love on the brain");
        music.setArtist("Rihana");

        for (int i = 0; i < 1000; i++) {
            music.reproduces();
        }
        for (int i = 0; i < 50; i++) {
            music.like();
        }

        Podcast podcast = new Podcast();
        podcast.setTitle("Romance Proibido");
        podcast.setHost("Rede Atlantida");
        podcast.setDescription("histórias inusitadas da galera sobre namoro, casamento, relações enroladas, traição, sexo e muito mais.");

        for (int i = 0; i < 500; i++) {
            music.reproduces();
        }
        for (int i = 0; i < 25; i++) {
            music.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.includes(music);
        favorites.includes(podcast);
    }
}
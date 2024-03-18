package br.com.alura.mymusics.models;

public class MyFavorites {
    public void includes(Audio audio){
        if (audio.getClassification() >= 9){
            System.out.println(audio.getTitle() + " é considerado sucesso absoluto " +
                    "e preferido por todos.");
        } else {
            System.out.println(audio.getTitle() + " também é um dos sucesso " +
                    "que todo mundo está curtindo.");
        }
    }
}

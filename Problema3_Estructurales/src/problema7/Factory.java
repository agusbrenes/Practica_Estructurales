/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Chuz2
 */
public class Factory {
    IPlaylist song;
    
    public void listarCanciones(String name[], String artist[], String album[]){
        for (int i = 0; i < artist.length; i++ ) {
            song = new Song(name[i], artist[i], album[i]);
            System.out.println("Datos de la canción" + song.mostrarInfo());
        }
    }
}

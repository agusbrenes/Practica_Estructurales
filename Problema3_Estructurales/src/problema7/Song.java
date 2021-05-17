/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;

/**
 *
 * @author Chuz2
 */
public class Song implements IPlaylist {
    public String name;
    public String artist;
    public String album;
    
    public Song (String name, String artist, String album){
        this.name = name;
        this.artist = artist;
        this.album = album;
    }

    @Override
    public String showInfo() {
        return "\nNombre: " + this.name + " Artista: " + this.artist + " Albúm: " + this.album;
    }
}

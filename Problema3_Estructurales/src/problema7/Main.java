/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;

import java.util.Scanner;

/**
 *
 * @author Chuz2
 */
public class Main {
    public static void main(String[] args){
        
        String[] name = {"Breathin", "Talk", "24K Magic", "The Diary of Jane"};
        String[] artist = {"Ariana Grande", "Coldplay", "Bruno Mars", "Breaking Benjamin"};
        String[] album = {"Sweetener", "X&Y", "24K Magic", "Phobia"};
        
        Factory factory = new Factory();
        factory.listarCanciones(name, artist, album);
    }
    
    
}

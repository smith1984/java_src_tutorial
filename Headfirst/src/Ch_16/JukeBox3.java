package Ch_16;

import java.util.*;
import java.io.*;
public class JukeBox3 {
    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String [] args){
        new JukeBox3().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs(){
        try{
            File file = new File("SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null)
                addSong(line);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    void  addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}

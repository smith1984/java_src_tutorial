package Cp_20;

import javax.sound.sampled.*;
import java.io.*;
class PlayAudio{
    PlayAudio(String s){
        play(s);
    }
    public void play(String file){
        Clip line = null;
        try{
// Создаем объект, представляющий файл.
            File f = new File(file);
// Получаем информацию о способе записи файла.
            AudioFileFormat aff = AudioSystem.getAudioFileFormat(f);
// Получаем информацию о способе записи звука.
            AudioFormat af = aff.getFormat();
// Собираем всю информацию вместе,
// добавляя сведения о классе Class.
            DataLine.Info info = new DataLine.Info(Clip.class, af);
            // Проверяем, можно ли проигрывать такой формат.
            if (!AudioSystem.isLineSupported(info)){
                System.err.println("Line is not supported");
                System.exit(0);
            }
// Получаем линию связи с файлом.
            line = (Clip)AudioSystem.getLine(info);
// Создаем поток байтов из файла.
            AudioInputStream ais = AudioSystem.getAudioInputStream(f);
// Открываем линию.
            line.open(ais);
        }catch(Exception e){
            System.err.println(e);
        }
// Начинаем проигрывание.
        line.start();
// Здесь надо сделать задержку до окончания проигрывания
// или остановить его следующим методом:
        line.stop();
// По окончании проигрывания закрываем линию.
        line.close();
    }
    public static void main(String[] args){
        if (args.length != 1)
            System.out.println("Usage: java PlayAudio filename");
        new PlayAudio(args[0]);
    }
}

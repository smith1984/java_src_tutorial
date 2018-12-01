package Ch_7;

import java.io.*;

class WriteFile
{
    public static void main ( String[] args ) {
        try {
            FileWriter file = new FileWriter( "data//test2" ) ;
            BufferedWriter buffer = new BufferedWriter( file ) ;
            buffer.write( "Дул ветер из последних сил," ) ;
            buffer.newLine() ;
            buffer.write( "И град хлестал, и ливень лил," );
            buffer.newLine() ;
            buffer.write( "И вспышки молний тьма глотала," ) ;
            buffer.newLine() ;
            buffer.write( "И небо долго грохотало..." ) ;
            buffer.newLine() ;
            buffer.write( "В такую ночь, как эта ночь," ) ;
            buffer.newLine() ;
            buffer.write( "Сам дьявол погулять не прочь." ) ;
            buffer.close() ;
        }
        catch ( IOException e )
        {
            System.out.println( "Произошла ошибка записи" ) ;
        }
    }
}

package Ch_7;

/**
 * Created by ito on 22.03.17.
 */
import java.util.zip.*;
import  java.io.*;

public class ZipDir {
    public static void exec(String zipFile, String zipperDir) throws FileNotFoundException, IOException{
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile));
        walkingDir(zos, zipperDir);
        zos.close();
    }

    public static void walkingDir(ZipOutputStream zos, String zipperDir){
        File zipDir = new File(zipperDir);
        String [] dirList = zipDir.list();

        for (int i = 0; i < dirList.length; i++){
            File f = new File(dirList[i]);
            if (f.isDirectory()) {
                String filePath = f.getPath();
                walkingDir(zos, filePath);
                continue;
            }
            else
            {
                try{
                    byte[] readBuffer = new byte[2048];
                    int bytesReader = 0;
                    String fullPath = zipperDir + "\\" + f.getPath();
                    System.out.println("\t архивируется: " + fullPath);
                    FileInputStream fis = new FileInputStream(fullPath);
                    ZipEntry ze = new ZipEntry(fullPath);
                    zos.putNextEntry(ze);

                    while ((bytesReader =fis.read(readBuffer)) != -1){
                        zos.write(readBuffer, 0, bytesReader);
                    }
                    fis.close();
                }
                catch (FileNotFoundException fnfe){
                    fnfe.printStackTrace();
                }
                catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
    }
}

package Ch_5;

import java.io.File;

/**
 * Created by ito on 21.03.17.
 */
class SameDateToDirFiles {
    public static void sameDateToDirFiles(String dir){
        long modified = System.currentTimeMillis();
        File walkDir = new File(dir);
        String[] dirList = walkDir.list();
        for (int i = 0; i < dirList.length; i++){
            File f = new File(dirList[i]);
            if (f.isDirectory()){
                sameDateToDirFiles(f.getPath());
                continue;
            }
            f.setLastModified(modified);
        }
    }
}

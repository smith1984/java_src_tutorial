package Cp_23;

import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;
import java.io.*;
public class PathTest{
    public static void main(String[] args){
        try{
            Path path = Paths.get("C:\\code\\PathTest.java");
            if (Files.exists(path)){
                System.out.println("File is readable: " +
                        Files.isReadable(path));
                BasicFileAttributes attrs = Files.readAttributes(path,
                        BasicFileAttributes.class);
                System.out.println("Basic attrs: " +
                        attrs.creationTime() + ", " +
                        attrs.isDirectory());
                UserPrincipal owner = Files.getOwner(path);
                System.out.println("File owner: " + owner.getName());
                for (Path d: path) System.out.println("File: " + d);
                if (attrs.isDirectory()){
                    try(DirectoryStream<Path> dir =
                                Files.newDirectoryStream(path)){
                        for (Path p: dir)
                            System.out.println("Path: " + p);
                    }catch(IOException ie){
                        ie.printStackTrace();
                    }
                }
                try(FileChannel fc = (FileChannel)Files.newByteChannel(
                        path, StandardOpenOption.READ,
                        StandardOpenOption.WRITE)){
                    ByteBuffer buf = ByteBuffer.allocate((int)fc.size());
                    int n = fc.read(buf);
                    System.out.println("n = " + n);
                    byte[] arr = new byte[n];
                    buf.position(0);
                    buf.get(arr);
                    for(byte b: arr)
                        System.out.print((char)b);
                }catch(IOException ie){
                    ie.printStackTrace();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

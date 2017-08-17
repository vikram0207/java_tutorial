/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;

/**
 *
 * @author vikramsingh
 */
public class Files {
    
    
    public static void main(String[] args) {
        File file = new File("/Users/vikramsingh/Desktop/");
        //if(f.exists()) {
//            System.out.println("FIle Exists");
//            
//            if(f.canRead()) {
//                System.out.println(f.toString());
//            }
            
            
            System.out.println("File Exists: " + file.exists());
            if (file.exists()) {
                System.out.println("Absolute Path: " + file.getAbsolutePath());
                System.out.println("Is Directory: " + file.isDirectory());
                System.out.println("Parent Path: " + file.getParent());
                if (file.isFile()) {
                    System.out.println("File size: " + file.length());
                    System.out.println("File LastModified: " + file.lastModified());
                } else {
                    for (File subfile : file.listFiles()) {
                        System.out.println("\t" + subfile.getName());
                    }
                }
            }        
    }
}

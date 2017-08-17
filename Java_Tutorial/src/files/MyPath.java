/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author vikramsingh
 */
public class MyPath {
    
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("test.txt");
        System.out.println(p.getFileName());
        System.out.println(p.getNameCount());
        System.out.println(p.getName(p.getNameCount() - 1));        
        System.out.println(p.getRoot());      
        System.out.println(p.toAbsolutePath());
        System.out.println(p.toRealPath(LinkOption.NOFOLLOW_LINKS));        
    }
            
    
    
}

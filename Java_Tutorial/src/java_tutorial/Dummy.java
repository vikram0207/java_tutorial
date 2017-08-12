/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tutorial;

/**
 *
 * @author vikramsingh
 */
public class Dummy {

    /**
     * @param args the command line arguments
     */
    public static void mainA(String[] args) {
        
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(1, "apple");
        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(same);
        
        
//        Test<String> st = new Test<String>();
//        st.setValue("aa");
//        st.getType();
        // TODO code application logic here
        String s1 = "1";
        String s2 = s1.concat("2"); 
        s2.concat("3"); 
        s2.concat("a");
        System.out.println(s2);
        
        
        String string = "animals"; 
        System.out.println(string.length()); 
        System.out.println(string.indexOf('n')); 
        System.out.println(string.indexOf('a')); 
        System.out.println(string.substring(3, 7));
        
        String result = "AniMaL ".trim().toLowerCase().replace('a', 'A'); System.out.println(result);
        System.out.println(result);
        
        
//        
//        String a = "abc";
//        String b = a.toUpperCase();
//        b = b.replace("B", "2").replace('C', '3'); 
//        System.out.println("a=" + a);
//        System.out.println("b=" + b);

        
        //String alpha = "";
        StringBuilder alpha = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++) 
            alpha.append(current);//alpha += current;
        System.out.println(alpha);        
        
        
        
        StringBuilder a = new StringBuilder("abc"); 
        StringBuilder b = a.append("de");

        b = b.append("f").append("g"); 
        System.out.println("a=" + a); 
        System.out.println("b=" + b);        
        
        
        //Vardump
        //isset
        //unset
        //Deployment
        //throw new RuntimeException
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-");
        sb.insert(0, "-");
        sb.insert(4, "-");
        sb.insert(10, "-");
        sb.insert(9, "-");
        System.out.println(sb);
// sb = animals- // sb = -animals- // sb = -ani-mals
//        if(!string.charAt(7)) {
//            System.out.println("")
//        }
    }
    
}


class TestA <T extends String & Runnable>
{
    public T val;
    public void setValue(T arg)
    {
        this.val = arg;
    }
    
    public void getType()
    {
        System.out.println(this.val.getClass().getTypeName());
    }

}




class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
}


class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
               p1.getValue().equals(p2.getValue());
    }
}

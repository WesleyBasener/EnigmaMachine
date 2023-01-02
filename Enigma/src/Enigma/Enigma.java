package Enigma;

public class Enigma {
    
    int a ,b, c;
    PlugBoard pb;
    Rotor r1, r2, r3;
    Reflector rf;
    char[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    Enigma(int h, int i, int j, int k){
        a = 0;
        b = 0;
        c = 0;
        
        pb = new PlugBoard();
        r1 = new Rotor(h);
        r2 = new Rotor(i);
        r3 = new Rotor(j);
        rf = new Reflector(k);
    }
    
    public int plugBoard(int a, int b) {
        return pb.swap(a,b);
    }
    
    public char encode(char ch) {
        
        int i = ch - 65;        
        
        if(i != -1) {
            i = pb.scramble(i);
            i = r1.scramble((i+a));
            i = r2.scramble((i+b));
            i = r3.scramble((i+c));
            i = rf.scramble(i);
            i = r3.scrambleBack((i+c));
            i = r2.scrambleBack((i+b));
            i = r1.scrambleBack((i+a));
            i = pb.scramble(i);
            
            ++a;
            if(a == 26) {
                a = 0;
                ++b;
                if(b == 26) {
                    b = 0;
                    ++c;
                    if(c == 26) {
                        c = 0;
                    }
                }
            }
        }
        return alph[i];
    }
}

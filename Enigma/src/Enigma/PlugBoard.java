package Enigma;

public class PlugBoard {
    int[] alph;
    
    PlugBoard(){
        alph = new int[26];
        for(int i = 0; i<26; ++i) {
            alph[i] = i;
        }
    }
    
    public int swap(int a, int b) {
        int ai = -1;
        int bi = -1;
        
        if(a > -1 && a < 26 && b > -1 && b < 26) {
            if(alph[a] == a && alph[b] == b) {
                alph[a] = b;
                alph[b] = a;
                return 0;
            }
            else {
                if(alph[a] == b && alph[b] == a) {
                    alph[a] = b;
                    alph[b] = a;
                    return 0;
                }
                return 1;
            }
        }
        return -1;
    }
    
    public int scramble(int a) {
        return alph[a];
    }
}

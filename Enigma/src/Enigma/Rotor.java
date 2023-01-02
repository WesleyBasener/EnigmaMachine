package Enigma;

public class Rotor {
    int[] alph;
    
    Rotor(int i){
        alph = new int[26];
        
        //Enigma I : UKW
        if(i == 1) {
            int[] alph1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
            for(int j = 0; j < 26; ++j) {
                alph[j] = alph1[j];
            }
        }
        //Enigma I : I
        if(i == 2) {
            int[] alph2 = {4, 10, 12, 5, 11, 6, 3, 16, 21, 25, 13, 19, 14, 22, 24, 7, 23, 20, 18, 15, 0, 8, 1, 17, 2, 9};
            for(int j = 0; j < 26; ++j) {
                alph[j] = alph2[j];
            }
        }
      //Enigma I : II
        if(i == 3) {
            int[] alph3 = {0, 9, 3, 10, 18, 8, 17, 20, 23, 1, 11, 7, 22, 19, 12, 2, 16, 6, 25, 13, 15, 24, 5, 21, 14, 4};
            for(int j = 0; j < 26; ++j) {
                alph[j] = alph3[j];
            }
        }
      //Enigma I : III
        if(i == 4) {
            int[] alph1 = {1, 3, 5, 7, 9, 11, 2, 15, 17, 19, 23, 21, 25, 13, 24, 4, 8, 22, 6, 0, 10, 12, 20, 18, 16, 14};
            for(int j = 0; j < 26; ++j) {
                alph[j] = alph1[j];
            }
        }
        //Enigma I : IV
        if(i == 5) {
            int[] alph2 = {4, 18, 14, 21, 15, 25, 9, 0, 24, 16, 20, 8, 17, 7, 23, 11, 13, 5, 19, 6, 10, 3, 2, 12, 22, 1};
            for(int j = 0; j < 26; ++j) {
                alph[j] = alph2[j];
            }
        }
      //Enigma I : V
        if(i == 5) {
            int[] alph3 = {21, 25, 1, 17, 6, 8, 19, 24, 20, 15, 18, 3, 13, 7, 11, 23, 0, 22, 12, 9, 16, 14, 5, 4, 2, 10};
            for(int j = 0; j < 26; ++j) {
                alph[j] = alph3[j];
            }
        }
    }
    
    public int scramble(int a) {
        return alph[a];
    }
    
    public int scrambleBack(int a) {
        for(int i = 0; i<26; ++i) {
            if(alph[i] == a) {
               return i; 
            }
        }
        return -1;
    }
}

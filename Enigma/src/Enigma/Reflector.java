package Enigma;

public class Reflector {
int[] alph;
    
    Reflector(int i){
        alph = new int[26];
        //Enigma I : UKW A
        if(i == 1) {
            int[] alph1 = {4, 9, 12, 25, 0, 11, 24, 23, 21, 1, 22, 5, 2, 17, 16, 20, 14, 13, 19, 18, 15, 8, 10, 7, 6, 3};
            for(int j = 0; j < 26; ++j) {
                alph[j] = alph1[j];
            }
        }
      //Enigma I : UKW B
        if(i == 2) {
            int[] alph2 = {24, 17, 20, 7, 16, 18, 11, 3, 15, 23, 13, 6, 14, 10, 12, 8, 4, 1, 5, 25, 2, 22, 21, 9, 0, 19};
            for(int j = 0; j < 26; ++j) {
                alph[j] = alph2[j];
            }
        }
      //Enigma I : UKW C
        if(i == 3) {
            int[] alph3 = {5, 21, 15, 9, 8, 0, 14, 24, 4, 3, 17, 25, 23, 22, 6, 2, 19, 10, 20, 16, 18, 1, 13, 12, 7, 11};
            for(int j = 0; j < 26; ++j) {
                alph[j] = alph3[j];
            }
        }
    }
    
    public int scramble(int a) {
        return alph[a];
    }
}

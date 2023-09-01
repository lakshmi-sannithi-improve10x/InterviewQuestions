public class NumbersOfVowelsAndConsonants {

    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        String str = "bed";
        for ( int k = 0; k < str.length(); k++){
            char c = str.charAt(k);
            if (c =='a'|| c == 'e'|| c =='i'|| c=='o'|| c =='u' ){
                vowels++;
            }else {
                consonants++;
            }
            System.out.println("Vowels Count is:" + vowels);
            System.out.println("Consonants Count is:" + consonants);
        }
    }
}

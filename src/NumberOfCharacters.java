public class NumberOfCharacters {

    public static void main(String[] args) {
        int count = 0;
        char search = 'b';
        String str = "bedbeb";
        int length = str.length();
        for (int i = 0; i< length; i++){
            if (str.charAt(i) == search){
                count++;
            }
            System.out.println(count);
        }
    }
}

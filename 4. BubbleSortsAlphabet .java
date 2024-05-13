public class BubbleSortsAlphabet {
	//num 4
    public static void main(String[] args) {
        char[] alphabetArray = {'z', 'a', 'b', 'd', 'c', 'f', 'e'};
        for (int i = 0; i < alphabetArray.length - 1; i++) {
            for (int j = 0; j < alphabetArray.length - i - 1; j++) {
                if (alphabetArray[j] > alphabetArray[j + 1]) {
                    char temp = alphabetArray[j];
                    alphabetArray[j] = alphabetArray[j + 1];
                    alphabetArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Alphabets:");
        for (char letter : alphabetArray) {
            System.out.print(letter + " ");
        }
    }
}


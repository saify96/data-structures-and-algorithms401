package hash;

public class RepeatedWord {
    public static void main(String[] args) {
        String test="Once upon a time, there was a brave princess who...";
        System.out.println(repeatedWord(test));
        String test2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        System.out.println(repeatedWord(test2));
        String test3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        System.out.println(repeatedWord(test3));
    }

    public static String repeatedWord(String sentence) {
        HashTable<String, String> repeatedWordTable = new HashTable<>(1024);
        String[] wordsArray = sentence.split(" ");
        for (String singleWord : wordsArray) {
            singleWord =singleWord.replaceAll("[^a-zA-Z]", "").toLowerCase();// to remove any Punctuation and convert it to lower case(to match the tests)
            if (repeatedWordTable.contain(singleWord)) {
                return singleWord;
            } else {
//                System.out.println(singleWord);
//                System.out.println("000");

                repeatedWordTable.addToHashTable(singleWord,singleWord);
//                System.out.println(repeatedWordTable.contain("a"));
//                System.out.println(repeatedWordTable.contain(singleWord));
            }
        }
        return "There's no repeated word";
    }
}

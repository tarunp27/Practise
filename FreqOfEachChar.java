import java.util.HashMap;

public class FreqOfEachChar {
    public static void main(String[] args) {
        String sent = "Good Morning Madam";
        char specificAlhpabet = 'm';

        HashMap<Character, Integer> freqMap = count(sent);

        if (freqMap.containsKey(specificAlhpabet)) {
            System.out.println("Frequency of " + specificAlhpabet + " : " + freqMap.get(specificAlhpabet));
        } else {
            System.out.println("The specific alhpabet" + specificAlhpabet + " ");
        }
    }

    public static HashMap<Character, Integer> count(String sent) {

        sent = sent.replace(" ", "");

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < sent.length(); i++) {
            char c = sent.charAt(i);

            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

        }
        for (char c : freqMap.keySet()) {
            System.out.println(c + ":" + freqMap.get(c));
        }
        return freqMap;
    }
}

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        String seedhi = "abcdefghijklmnopqrstuvwxyz";
        String ulti = "zyxwvutsrqponmlkjihgfedcba";

        // 1. Bahar wala loop: ek-ek word uthane ke liye
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int sum = 0;

            // 2. Andar wala loop: us word ke har letter ka weight jodne ke liye
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                int index = seedhi.indexOf(ch); // letter ki position (0 se 25)
                sum += weights[index];          // us position ka weight jodo
            }

            // 3. Remainder nikaal kar ulta letter dabbe mein daalo
            int rem = sum % 26;
            sb.append(ulti.charAt(rem));
        }

        return sb.toString();
    }
}
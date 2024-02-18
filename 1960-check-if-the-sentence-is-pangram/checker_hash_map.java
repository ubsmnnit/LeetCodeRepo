class Solution {
    public boolean checkIfPangram(String sentence) {

        Map<Character,Boolean> checker = new HashMap<>();
        int count = 0;

        for (int i = 0; i < sentence.length(); i++){
            if(checker.containsKey(sentence.charAt(i))) {

               // System.out.println(sentence.charAt(i));

                checker.put(sentence.charAt(i),false);
            }
            else {
                checker.put(sentence.charAt(i),true);
            count += 1;

            }
        }
        //System.out.println(count);

       // System.out.println(sentence.length());

        return count == 26 ;
        
    }
}

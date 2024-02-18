class Solution {
    public boolean checkIfPangram(String sentence) {

        String alphbate = "qwertyuiopasdfghjklzxcvbnm" ;
        int count = 0;

        for (int i = 0; i < alphbate.length(); i++){
           
            if(sentence.contains(String.valueOf(alphbate.charAt(i)))){
                count += 1;

            }
        }
        System.out.println(count);

       System.out.println(sentence.length());

        return count == 26 ;
        
    }
}
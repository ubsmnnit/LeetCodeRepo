class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

      
       switch(ruleKey){
           case "type" : return match(items,ruleKey,ruleValue,0,0);
           case "color" : return match(items,ruleKey,ruleValue,0,1);
           default: return match(items,ruleKey,ruleValue,0,2);
       }


}

public static int match(List<List<String>> items, String ruleKey, String ruleValue, int i, int j){

if(i == items.size()) return 0;

if(items.get(i).get(j).equals(ruleValue)) return 1 + match(items,ruleKey,ruleValue,i+1,j);

else return match(items,ruleKey,ruleValue,i+1,j);



//System.out.println(items.get(i).get(j) + " " + i + " " + ruleValue);


}

}
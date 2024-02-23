class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        Map<String,Integer> specs = new HashMap<>();

        specs.put("type",0);
        specs.put("color",1);
        specs.put("name",2);

        int j = specs.get(ruleKey);
        int count = 0;

        for(int i =0; i< items.size(); i++){
            List<String> element = items.get(i);
            if (element.get(j).equals(ruleValue)) count += 1; 
        }

    return count;
        
    }
}
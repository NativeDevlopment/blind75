class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String,List<String>> anagramMap = new HashMap();   
     List<List<String>>  result= new ArrayList();
     for(int i = 0 ;i < strs.length ;i++){
        int [] frequency = new int [26];
        String item = strs[i];
        for (int j =0 ; j < item.length(); j++){
            int charIndex= item.charAt(j)- 'a';
            frequency[charIndex]= frequency[charIndex]+1;
        }
        String frquencyString =  getFrequencyString(frequency);
        List <String> anagramGroup = new ArrayList();
        if(anagramMap.containsKey(frquencyString)){
            anagramGroup.clear();
            anagramGroup=anagramMap.get(frquencyString);
            anagramGroup.add(item);
        anagramMap.put (frquencyString,anagramGroup);
        }else{

        anagramGroup.add(item);
        anagramMap.put (frquencyString,anagramGroup);}
     }
    for (List<String> value : anagramMap.values()) {
    result.add(value);
}
return result;
    }
    private String  getFrequencyString(int [] frequency) {
        StringBuilder frequencyString = new StringBuilder();
        char ch = 'a';
        for(int i =0 ; i < frequency.length ; i++ ){
            if(frequency[i]!=0){
            frequencyString.append(ch).append(frequency[i]);
            
            }
         ch= (char)(ch + 1);

        }
return frequencyString.toString();
    }
}

class Solution {
    public void sortByLength(String[] arr) {
        HashMap<Integer,List<String>> track=new HashMap<>();
        int len=0;
        List<Integer> keys=new LinkedList<>();
        for(String i:arr){
            len=i.length();
            if(!track.keySet().contains(len)){
                List<String> step=new LinkedList<>();
                keys.add(len);
                step.add(i);
                track.put(len,step);
            }else{
                track.get(len).add(i);
            }
        }
        Collections.sort(keys);
        int pointer=0;
        for(int i:keys){
            for(int j=0;j<track.get(i).size();j++){
                arr[pointer++]=track.get(i).get(j);
            }
        }
        
    }
}

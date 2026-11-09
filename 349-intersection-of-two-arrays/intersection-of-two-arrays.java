class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionset = new HashSet<>();
        int index = 0;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i:nums1){
            if(!set.contains(i)) set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i))   intersectionset.add(i);
        }
        int res[] = toPrimitiveArray(intersectionset);
        return res;
    }
    public int[] toPrimitiveArray(HashSet<Integer> set) {
    int size = set.size();
    int[] result = new int[size];
    int index = 0;
    for (int i  : set) {
        result[index++] = i; 
    }
    
    return result;
}
}
class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] rs = new int[k];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            map.putIfAbsent(nums[i], count);
            int value = map.get(nums[i]) + 1;
            map.put(nums[i], value);
        }
//        System.out.println(map.values());
        int[] temp = new int[map.size()];
        int index = 0;
        for (Integer value : map.values()) {
            temp[index] = value;
            index++;
        }
        Arrays.sort(temp);
        int j = temp.length - 1;
        int flag = 0;
        for (int i = 0; i < k; i++) {
            map.remove(flag);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(temp[j])) {
                    rs[i] = entry.getKey();
                    if (j > 0) {
                        j--;
                    }
                    flag = entry.getKey();
                    break;
                }
            }
        }
//        for(int r : rs){
//            System.out.println(r);
//        }
        return rs;
    }
}

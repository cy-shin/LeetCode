class Solution {
    public boolean isHappy(int n) {
        boolean flag = true;
        
        List<Integer> calculateList = new ArrayList<>();

        while(flag){
            int sum = 0;

            while(n>0){
                sum += (n%10) * (n%10);
                n /= 10;
            }

            n = sum;

            if(n==1) break;

            if(calculateList.contains(n)) {
                flag = false;
            } else {
                calculateList.add(n);
            }
        }

        return flag;
    }
}
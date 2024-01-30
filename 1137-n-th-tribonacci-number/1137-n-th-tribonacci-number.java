class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;

        int one_step_before = 1;
        int two_steps_before = 1;
        int three_steps_before = 0;
        int f = 0;

        for(int i=2; i<n; i++){
            f = one_step_before + two_steps_before + three_steps_before;
            three_steps_before = two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = f;
        }
        return f;  
    }
}
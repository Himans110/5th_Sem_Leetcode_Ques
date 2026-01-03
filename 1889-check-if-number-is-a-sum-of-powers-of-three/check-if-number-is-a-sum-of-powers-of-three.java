class Solution {
    public boolean checkPowersOfThree(int n) {
        return fun(n, 0);
    }
    public boolean fun(int target, int i) {
        if (target == 0) return true;
        if (target < 0 || i > 16) return false;
        int power = (int)Math.pow(3, i);
        boolean pick = fun(target - power, i + 1);
        boolean notPick = fun(target, i + 1);
        return pick || notPick;
    }
}

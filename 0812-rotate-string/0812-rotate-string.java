class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()){
            return false;
        }
        String main = goal+goal;
        return main.contains(s);
    }
}
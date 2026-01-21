class MinStack {
    ArrayList<Integer> stack;
    ArrayList<Integer> minstack;
    public MinStack() {
        stack = new ArrayList<>();
        minstack = new ArrayList<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.add(val);
            minstack.add(val);
        }
        else{
            stack.add(val);
            minstack.add(Math.min(val,minstack.get(minstack.size()-1)));
        }
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
        minstack.remove(minstack.size()-1);
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.get(stack.size()-1);
        }
        return -1;
    }
    
    public int getMin() {
        return minstack.get(minstack.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
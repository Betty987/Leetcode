class DataStream {
    int lastelem;
    int timeseen;
    int value;
    int k;
    public DataStream(int value, int k) {
        this.value=value;
        this.k=k;
    }
    
    public boolean consec(int num) {
        if(lastelem==num){
            timeseen++;
        }
        else{
            timeseen=1;
        }
        lastelem=num;
        return lastelem==value && timeseen>=k;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */

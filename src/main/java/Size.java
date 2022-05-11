public enum Size {
    SMALL(1),
    MEDIUM (2),
    LARGE(3);
    private int sizeNumber;
    private Size(int s){
        this.sizeNumber=s;
    }
    public int getSizeNumber(){
        return sizeNumber;
    }
}

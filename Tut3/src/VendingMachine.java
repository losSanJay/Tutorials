public class VendingMachine {

    private int canCount;
    private int tokenCount;

    public VendingMachine(){
        canCount = 10;
        tokenCount = 0;
    }

    public VendingMachine(int Cans) {
        canCount=Cans;
        tokenCount=0;
    }
    public void insertToken(){
        canCount--;
        tokenCount++;
    }
    public void fillUp(int Cans){canCount += Cans;}
    public int getCanCount(){ return canCount;}
    public int getTokenCount(){
        return tokenCount;}

    public int getcanCount() {
        return canCount;
    }

}

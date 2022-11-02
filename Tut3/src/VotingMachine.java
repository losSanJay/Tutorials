public class VotingMachine {
    private int labourVotes;
    private int consoVotes;

    public void voteLabour() {
        labourVotes+=1;
        labourVotes += (int) 3*Math.random();
    }
    public void voteConservative() {
        ++consoVotes;
    }

    public int getLabourVotes() {
        return labourVotes;
    }

    public int getConservativeVotes() {
        return consoVotes;
    }
    public void clear(){
        labourVotes = 0;
        consoVotes = 0;
    }
}

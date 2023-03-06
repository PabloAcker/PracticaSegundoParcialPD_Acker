package ej1;

public class Tesis {
    private int numTesis;
    private String revision;

    public Tesis(int numTesis, String revision) {
        this.numTesis = numTesis;
        this.revision = revision;
    }

    public int getNumTesis() {
        return numTesis;
    }

    public void setNumTesis(int numTesis) {
        this.numTesis = numTesis;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public void showInfoTesis(){
        System.out.println("Número de tesis: "+getNumTesis());
        System.out.println("Revision: "+getRevision());
    }

}

package entities;

public class Basket {

    private String descr;
    private boolean ispayed;
    private  int keysLength;

    public Basket(String descr, boolean ispayed, int keysLength) {
        this.descr = descr;
        this.ispayed = ispayed;
        this.keysLength = keysLength;
    }

    public Basket() {}

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public boolean isIspayed() {
        return ispayed;
    }

    public void setIspayed(boolean ispayed) {
        this.ispayed = ispayed;
    }

    public int getKeysLength() {
        return keysLength;
    }

    public void setKeysLength(int keysLength) {
        this.keysLength = keysLength;
    }
}

package model;

public class TshirtModel {

    Integer tshirt;
    String tv1,tv2,tv3;

    public Integer getTshirt() {
        return tshirt;
    }

    public void setTshirt(Integer tshirt) {
        this.tshirt = tshirt;
    }

    public String getTv1() {
        return tv1;
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    public String getTv2() {
        return tv2;
    }

    public void setTv2(String tv2) {
        this.tv2 = tv2;
    }

    public String getTv3() {
        return tv3;
    }

    public void setTv3(String tv3) {
        this.tv3 = tv3;
    }

    public TshirtModel(Integer tshirt, String tv1, String tv2, String tv3) {
        this.tshirt = tshirt;
        this.tv1 = tv1;
        this.tv2 = tv2;
        this.tv3 = tv3;
    }
}

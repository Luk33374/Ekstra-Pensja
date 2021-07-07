package sample.service;

public class SW {
    private int w0;
    private int w5;
    private int w10;
    private int w25;
    private int w80;
    private int w200;
    private int w1000;
    private int w25000;
    private int w1200000;

    public void fill(int win){

        switch (win){
            case 5:
                w5++;
                break;
            case 10:
                w10++;
                break;
            case 25:
                w25++;
                break;
            case 80:
                w80++;
                break;
            case 200:
                w200++;
                break;
            case 1000:
                w1000++;
                break;
            case 25000:
                w25000++;
                break;
            case 1200000:
                w1200000++;
                break;
            default:
                w0++;
                break;

        }
    }

    @Override
    public String toString() {
        return "SW{" +
                "w0=" + w0 +
                ", w5=" + w5 +
                ", w10=" + w10 +
                ", w25=" + w25 +
                ", w80=" + w80 +
                ", w200=" + w200 +
                ", w1000=" + w1000 +
                ", w25000=" + w25000 +
                ", w1200000=" + w1200000 +
                '}';
    }
}

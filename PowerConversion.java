import java.io.*;

class PowerConversion {
    
    public static void main(String args[]) {

        String conversion = args[0];
        Double v1 = Double.valueOf(args[1]);
        
        if (conversion.equals("w2kw")) {
            System.out.println(w2kw(v1));    
        } else if (conversion.equals("kw2w")) {
            System.out.println(kw2w(v1));    
        } else {
            System.out.println("invalid parameter 1");
        }
    }

    public static Double kwh2dollars (int month) {
        // doller price per kWh
        if (month <= 6 || month >= 10) {
            return .066;
        } else {
            return  .0722;
        }
    }

    public static Double w2kw (Double w) {
        return w/1000;
    }

    public static Double kw2w (Double kw) {
        return kw * 1000;
    }

    public static Double kwh2mj (Double kwh) {
        // kWh to megajoules
        return kwh * 3.6;
    }

    public static Double j2cal (Double j) {
        // joules to calories
        return j * .239;
    }




}
package chapter13;

class WildcardDemo {

    public static void main(String args[]) {

        NumericFns2<Integer> iOb
                = new NumericFns2<Integer>(6);

        NumericFns2<Double> dOb
                = new NumericFns2<Double>(-6.0);

        NumericFns2<Long> lOb
                = new NumericFns2<Long>(5L);

        System.out.println("Testing iOb and dOb.");
    //    if (iOb.absEqual(dOb)) {
     //       System.out.println("Absolute values are equal.");
      //  } else {
       //     System.out.println("Absolute values differ.");
        //}

        System.out.println();

       // System.out.println("Testing iOb and lOb.");
       // if (iOb.absEqual(lOb)) {
        //    System.out.println("Absolute values are equal.");
      //  } else {
      //      System.out.println("Absolute values differ.");
       // }

    }
}

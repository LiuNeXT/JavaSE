package com.heima.Base.Day27;

public class Demo1_Template {

    public static void main(String[] args) {

        Demo demo = new Demo();
        System.out.println(demo.getTime());

    }


    abstract static class GetTime {

        public final long getTime() {

            long start = System.currentTimeMillis();
            code();
            long end = System.currentTimeMillis();
            return end - start;

        }

        public abstract void code();

    }

    static class Demo extends GetTime {

        @Override
        public void code() {
            int i = 0;
            while (i < 1000) {
                System.out.println(i);
                i++;

            }
        }
    }
}

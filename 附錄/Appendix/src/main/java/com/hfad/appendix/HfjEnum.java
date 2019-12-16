package com.hfad.appendix;

public class HfjEnum
{
    enum Names
    {
        JERRY("lead guitar")
        {
            public String sings()
            {
                return "plaintively";
            }
        },
        BOBBY("rhythm guitar")
        {
            public String sings()
            {
                return "hoarsely";
            }
        },
        PHIL("bass");
        private String instrument;

        Names(String instrument)
        {
            this.instrument = instrument;
        }

        public String getInstrument()
        {
            return this.instrument;
        }

        public String sings()
        {
            return "occasionally";
        }
    }

    public static void main(String args[])
    {
        for(Names n : Names.values())
        {
            System.out.print(n);
            System.out.print(" , instrument：" + n.getInstrument());
            System.out.print(" , sings： " + n.sings());
        }
    }
}

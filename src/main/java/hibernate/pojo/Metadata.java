package hibernate.pojo;

    public class Metadata
    {
        private String optime;

        public String getOptime ()
        {
            return optime;
        }

        public void setOptime (String optime)
        {
            this.optime = optime;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [optime = "+optime+"]";
        }
    }


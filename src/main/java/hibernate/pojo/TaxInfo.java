package hibernate.pojo;

    public class TaxInfo {
        private Integer taxNumber;
        private String city;
        private String taxApt;
        private String result;

        public Integer getTaxNumber() {
            return taxNumber;
        }

        public void setTaxNumber(Integer taxNumber) {
            this.taxNumber = taxNumber;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getTaxApt() {
            return taxApt;
        }

        public void setTaxApt(String taxApt) {
            this.taxApt = taxApt;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }



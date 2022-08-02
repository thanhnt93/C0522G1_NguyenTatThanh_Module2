package case_study.model;

public abstract class Facility {
        private String serviceCode;
        private String serviceName;
        private double areaUse;
        private double rentalCosts;
        private int maxNumberOfPeople;
        private String rentalType;

        public Facility() {
        }

        public Facility(String serviceCode, String serviceName, double areaUse, double rentalCosts, int maxNumberOfPeople, String rentalType) {
                this.serviceCode = serviceCode;
                this.serviceName = serviceName;
                this.areaUse = areaUse;
                this.rentalCosts = rentalCosts;
                this.maxNumberOfPeople = maxNumberOfPeople;
                this.rentalType = rentalType;
        }

        public String getServiceCode() {
                return serviceCode;
        }

        public void setServiceCode(String serviceCode) {
                this.serviceCode = serviceCode;
        }

        public String getServiceName() {
                return serviceName;
        }

        public void setServiceName(String serviceName) {
                this.serviceName = serviceName;
        }

        public double getAreaUse() {
                return areaUse;
        }

        public void setAreaUse(double areaUse) {
                this.areaUse = areaUse;
        }

        public double getRentalCosts() {
                return rentalCosts;
        }

        public void setRentalCosts(double rentalCosts) {
                this.rentalCosts = rentalCosts;
        }

        public int getMaxNumberOfPeople() {
                return maxNumberOfPeople;
        }

        public void setMaxNumberOfPeople(int maxNumberOfPeople) {
                this.maxNumberOfPeople = maxNumberOfPeople;
        }

        public String getRentalType() {
                return rentalType;
        }

        public void setRentalType(String rentalType) {
                this.rentalType = rentalType;
        }

        @Override
        public String toString() {
                return "Mã dịch vụ: " + serviceCode +
                        ", Tên dịch vụ: " + serviceName +
                        ", Diện tích sử dụng: " + areaUse +
                        ", Chi phí thuê: " + rentalCosts +
                        ", Số lượng người tối đa: " + maxNumberOfPeople +
                        ", Kiểu thuê: " + rentalType;
        }
}

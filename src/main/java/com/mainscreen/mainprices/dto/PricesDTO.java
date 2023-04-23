package com.mainscreen.mainprices.dto;


public class PricesDTO {

        private String name;
        private String price;

        public PricesDTO() {
        }

        public PricesDTO(String name, String price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
}

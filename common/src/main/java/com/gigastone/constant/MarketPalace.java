package com.gigastone.constant;

public enum MarketPalace {

        USA(1, "ATVPDKIKX0DER"),
        Canada(2, "A2EUQ1WTGCTBG2"),
        Mexico(3,"A1AM78C64UM0Y8"),
        Japan(4,"A1VC38T7YXB528");


        private Integer id;

        private String code;

        MarketPalace(int id, String code) {
            this.id = id;
            this.code = code;
        }

        public int getId() {
            return id;
        }

        public String getCode() {
            return code;
        }

}

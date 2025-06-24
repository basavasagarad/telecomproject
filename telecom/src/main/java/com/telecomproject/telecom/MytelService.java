package com.telecomproject.telecom;

public class MytelService {

        public String processRecharge(String mobile, int packId) {
            if (packId == 1) {
                return "Recharge Successful for " + mobile + ": ₹200, 30 days, 3GB/day.";
            } else if (packId == 2) {
                return "Recharge Successful for " + mobile + ": ₹300, 30 days, 6GB/day.";
            } else {
                return "Invalid Package ID";
            }
        }

        public String payBill(String mobile) {
            return "Bill Payment Successful for " + mobile + ": ₹600 paid.";
        }

        public String convertSim(String mobile, int type) {
            if (type == 6) {
                return "Converted Prepaid to Postpaid for " + mobile;
            } else if (type == 7) {
                return "Converted Postpaid to Prepaid for " + mobile;
            } else {
                return "Invalid conversion option.";
            }
        }

        public String checkBalance(String mobile) {
            return "Balance for " + mobile + ": ₹199, 30 SMS, 200 min/day talktime.";
        }

        public String getProfile(String mobile) {
            return "Profile for " + mobile + ": Name - Dilip, Location - Hyderabad, Telangana.";
        }



}

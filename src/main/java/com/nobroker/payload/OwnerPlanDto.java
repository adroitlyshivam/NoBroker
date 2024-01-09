package com.nobroker.payload;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class OwnerPlanDto {

    private long planId;

    private  String planName;

    private String price;

    private int planValidity;

    private double propertyPromotion;

    private boolean relationshipManager;

    private boolean rentalAgreement;

    private boolean guaranteedTenants;

    private boolean showingProperty;
    private boolean facebookMarketingOfProperty;

}

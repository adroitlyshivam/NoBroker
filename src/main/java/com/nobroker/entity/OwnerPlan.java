package com.nobroker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OwnerPlan {
    @Id
    private long planId;
    @Column(name="plan_name",unique = true)
    private  String planName;
    @Column(name="price")
    private String price;
    @Column(name="plan_validity")
    private int planValidity;
    @Column(name = "property_promotion")
    private double propertyPromotion;
    @Column(name="relationship_manager")
    private boolean relationshipManager;
    @Column(name="rental_agreement")
    private boolean rentalAgreement;
    @Column(name="guaranteed_tenants")
    private boolean guaranteedTenants;
    @Column(name="showing_property")
    private boolean showingProperty;
    @Column(name ="facebook_marketing_of_property")
    private boolean facebookMarketingOfProperty;

}

package com.capgemini;


class Category {
	private int categoryId;
	private String categoryName;
}

class CapStoreConvention {
	private int productId;
	// declare and mention relationship with category
	private String productName;
	private String productBrand;
	private String productDescription;
	private double actualPrice;
	private double discountPrice;
	private long productQuantity;
}

class Customer {
	private int customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	private String customerPassword;
	private String customerContact;
	private boolean isCustomerActivated;
}

class Merchant {
	private int merchantId;
	private String merchantFirstName;
	private String merchantLastName;
	private String merchantEmail;
	private String merchantPassword;
	private String merchantContact;
	private boolean isMerchantActivated;
}

class Admin {
	private int adminId;
	private String adminFirstName;
	private String adminLastName;
	private String adminEmail;
	private String adminPassword;
	private String adminContact;
}

class Address {
	private int addressId;
	// declare and mention relationship with Customer
	private String addressLine1;
	private String addressLine2;
	private String state;
	private String city;
	private String postalCode;
}

class Cart {
	private int cardId;
	// declare and mention relationship with Product
	private long quantity;
	private boolean productInCart;
}

class WishList {
	private int wishhListId;
	// declare and mention relationship with Product
	// declare and mention relationship with Customer
}

class Review {
	private int reviewId;
	// declare and mention relationship with Product
	// declare and mention relationship with Customer
	private int productRating;
	private String productComment;
}

class Report {
	private int reportId;
	// declare and mention relationship with Product
	// declare and mention relationship with Customer
	// declare and mention relationship with Admin
}

class CheckOut {
	private int checkOutId;
	// declare and mention relationship with Product
	// declare and mention relationship with Customer
	// declare and mention relationship with Coupon
	// declare and mention relationship with Address
	private String checkOutDate;
	private long quantity;
}

class Coupons{
	private int couponId;
	//declare and mention relationship with Product
	private String couponCode;
	private long productDiscount;
	private String expiryDate;
	private boolean isUsed;
}

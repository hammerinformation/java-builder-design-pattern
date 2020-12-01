package com.example.test;




 class Product {

     //Github: @hammerinformation
    private  String name;
    private  int price;
    Product(){

    }
    Product(Builder builder) {
        this.name= builder.name;
        this.price=builder.price;
    }
    public int getPrice() { return price; }
    public String getName() { return name; }

    public  static  class  Builder{
        private  String name;
        private  int price;

        public Builder  setName(String name){
            this.name=name;
            return  this; }

        public Builder setPrice(int price) {
            this.price = price;
            return  this; }

        public Product Build(){
            Product product = new Product(this);
            return  product;
        }
    }

}
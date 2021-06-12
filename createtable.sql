create table address_details (
       address_id int4 not null,
        area varchar(255),
        building_name varchar(255),
        city varchar(255),
        flat_no varchar(255),
        pincode varchar(255),
        state varchar(255),
        primary key (address_id)
    );

    
    create table admin_details (
       admin_id int4 not null,
        contact_number varchar(255),
        name varchar(255),
        primary key (admin_id)
    );

    
    create table billing_details (
       billing_id int4 not null,
        transaction_status varchar(255),
        transaction_date varchar(255),
        transaction_mode varchar(255),
        address_id int4,
        order_id int4,
        primary key (billing_id)
    );

    
    create table cart_dto (
       cart_id int4 not null,
        cust_id int4,
        primary key (cart_id)
    );

    
    create table cart_veg_link (
       cart_id int4 not null,
        veg_id int4 not null
    );

    
    create table customer_details (
       customer_id int4 not null,
        email_id varchar(255),
        mobile_number varchar(255),
        name varchar(255),
        address_id int4,
        primary key (customer_id)
    );

    
    create table feedback_details (
       feedback_id int4 not null,
        comments varchar(255),
        rating int4 not null,
        cust_id int4,
        vegetable_id int4,
        primary key (feedback_id)
    );

    
    create table order_details (
       order_id int4 not null,
        order_date date,
        status varchar(255),
        total_amount float8,
        cust_id int4,
        primary key (order_id)
    );

    
    create table order_veg_link (
       order_id int4 not null,
        veg_id int4 not null
    );

    
    create table user_details (
       user_id varchar(255) not null,
        confirm_password varchar(255),
        password varchar(255),
        role varchar(255),
        primary key (user_id)
    );

    
    create table vegetable_details (
       veg_id int4 not null,
        name varchar(255),
        price float8 not null,
        quantity int4 not null,
        type varchar(255),
        primary key (veg_id)
    );

    
   
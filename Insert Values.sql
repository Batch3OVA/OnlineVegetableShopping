insert into address_details values(100,'kalyan nagar','prestige building','vellore',75,632009,'Tamil Nadu');
insert into address_details values(200,'TVK nagar','preethi building','chennai',65,653009,'Tamil Nadu');
insert into address_details values(300,'Rk nagar','mount view building','Banglore',45,653056,'Karnataka');
insert into address_details values(400,'balagi nagar','joseph building','Bhopal',85,645890,'Madhya pradesh');

insert into admin_details values(1456,9626179780,'Divyashree');
insert into admin_details values(1256,96261797900,'kavyashree');
insert into admin_details values(1956,96261497900,'Hasini');
insert into admin_details values(2956,96261297900,'Diya');

insert into billing_details values(3486,'pending',12-03-2021,'online',100,67897);
insert into billing_details values(3487,'completed',13-03-2021,'offline',200,67898);
insert into billing_details values(3488,'pending',14-03-2021,'online',300,67398);
insert into billing_details values(3489,'completed',15-03-2021,'offline',400,67390);

insert into customer_details values(7869,gcrk17@gmail.com,8248127079,'Rohith',100);
insert into customer_details values(7868,'gcgk27@gmail.com',8248157079,'Gowtham',200);
insert into customer_details values(7862,'crl@gmail.com',8248257079,'Raji',300);
insert into customer_details values(7861,'raju@gmail.com',8248257079,'Raju',400);

insert into user_details values(1998,'divyabharu','divyabharu','customer');
insert into user_details values(1999,'tinkuhasini','tinkuhasini','admin');
insert into user_details values(1997,'rohithgowtham','rohithgowtham','customer');
insert into user_details values(1996,'rajidiya','rajidiya','admin');

insert into vegetable_details values(2345,'carrot',50,15,'root');
insert into vegetable_details values(2344,'beans',50,15,'creeper');
insert into vegetable_details values(2342,'beetroot',30,14,'root');
insert into vegetable_details values(2362,'pumpkin',40,18,'creeper');

insert into cart_dto values(1239,7869);
insert into cart_dto values(1279,7868);
insert into cart_dto values(1269,7862);
insert into cart_dto values(1219,7861);

insert into cart_veg_link values(1239,2345);
insert into cart_veg_link values(1279,2344);
insert into cart_veg_link values(1269,2342);
insert into cart_veg_link values(1219,2362);
                                          
insert into order_details values(67897,'25-06-2021','completed',500,7869);
insert into order_details values(67898,'25-07-2021','pending',300,7868);
insert into order_details values(67398,'27-02-2021','completed',200,7862);
insert into order_details values(67390,'20-08-2021','pending',700,7861);

insert into order_veg_link values(67897,2345);
insert into order_veg_link values(67898,2344);
insert into order_veg_link values(67398,2342);
insert into order_veg_link values(67390,2362);

insert into feedback_details values(4321,'Good',4.5,7869,2345);
insert into feedback_details values(4322,'Average',2.5,7868,2344);
insert into feedback_details values(4325,'Poor',1.5,7862,2342);
insert into feedback_details values(4329,'Average',3.3,7861,2362);

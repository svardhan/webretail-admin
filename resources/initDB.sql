insert address
(address_id, address_line1,address_line2,landmark,city,zip_code,state,country,created_by,created_date,updated_by,updated_date,record_version_no, deleted_yn)
values
(1, 'address_line1', 'address_line2', 'landmark', 'city', '687543','state', 'country', 1, NOW(), 1, NOW(), 0, 0);

insert party
(party_id, first_name, middle_name, last_name, email, home_phone_number, business_phone_number, cell_phone_number, address_id, gender, date_of_birth,created_by,created_date,updated_by,updated_date,record_version_no, deleted_yn)
values
(1, 'first_name', 'middle_name', 'last_name', 'email','789098765', '123456789','123456789', 1, 'M', NOW(), 1, NOW(), 1, NOW(), 0, 0);

insert user 
(user_id, party_id, status, locale_code, reward_points, subscribed_for_news_letter_yn, created_by, created_date, updated_by, updated_date, record_version_no, deleted_yn) 
values 
(1, 1, 'NEW', 'en_US', 0, 0, 1, NOW(), 1, NOW(), 0, 0);

select * from category;
insert category values (1, 1, NOW(), 0, 0, 1, NOW(), 'Category1','Category1');
insert category values (2, 1, NOW(), 0, 0, 1, NOW(), 'Category2','Category2');
insert category values (3, 1, NOW(), 0, 0, 1, NOW(), 'Category3','Category3');
insert category values (4, 1, NOW(), 0, 0, 1, NOW(), 'Category4','Category4');
insert category values (5, 1, NOW(), 0, 0, 1, NOW(), 'Category5','Category5');
insert category values (6, 1, NOW(), 0, 0, 1, NOW(), 'Category6','Category6');
insert category values (7, 1, NOW(), 0, 0, 1, NOW(), 'Category7','Category7');
insert category values (8, 1, NOW(), 0, 0, 1, NOW(), 'Category8','Category8');
insert category values (9, 1, NOW(), 0, 0, 1, NOW(), 'Category9','Category9');
insert category values (10, 1, NOW(), 0, 0, 1, NOW(), 'Category10','Category10');
insert category values (11, 1, NOW(), 0, 0, 1, NOW(), 'Category11','Category11');
insert category values (12, 1, NOW(), 0, 0, 1, NOW(), 'Category12','Category12');
insert category values (13, 1, NOW(), 0, 0, 1, NOW(), 'Category13','Category13');
insert category values (14, 1, NOW(), 0, 0, 1, NOW(), 'Category14','Category14');
insert category values (15, 1, NOW(), 0, 0, 1, NOW(), 'Category15','Category15');
insert category values (16, 1, NOW(), 0, 0, 1, NOW(), 'Category16','Category16');
insert category values (17, 1, NOW(), 0, 0, 1, NOW(), 'Category17','Category17');
insert category values (18, 1, NOW(), 0, 0, 1, NOW(), 'Category18','Category18');
insert category values (19, 1, NOW(), 0, 0, 1, NOW(), 'Category19','Category19');
insert category values (20, 1, NOW(), 0, 0, 1, NOW(), 'Category20','Category20');
insert category values (21, 1, NOW(), 0, 0, 1, NOW(), 'Category21','Category21');
insert category values (22, 1, NOW(), 0, 0, 1, NOW(), 'Category22','Category22');
insert category values (23, 1, NOW(), 0, 0, 1, NOW(), 'Category23','Category23');
insert category values (24, 1, NOW(), 0, 0, 1, NOW(), 'Category24','Category24');
insert category values (25, 1, NOW(), 0, 0, 1, NOW(), 'Category25','Category25');


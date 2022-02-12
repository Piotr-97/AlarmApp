
INSERT INTO address(id,street,apartmentnumber,zipcode,city)
values ( 1,'11 Listopada','12','00-928','Warszawa');
INSERT INTO address(id,street,apartmentnumber,zipcode,city)
values ( 2,'Popularna','1','91-725','lodz');
INSERT INTO address(id,street,apartmentnumber,zipcode,city)
values ( 3,'Koszykowa 86','','00-928','Warszawa');
INSERT INTO address(id,street,apartmentnumber,zipcode,city)
values ( 4,'aaa','12','00-928','Warszawa');
INSERT INTO address(id,street,apartmentnumber,zipcode,city)
values ( 5,'aaa','12','00-928','Warszawa');
INSERT INTO address(id,street,apartmentnumber,zipcode,city)
values ( 6,'aaa','12','00-928','Warszawa');
INSERT INTO address(id,street,apartmentnumber,zipcode,city)
values ( 7,'aaa','12','00-928','Warszawa');
INSERT INTO address(id,street,apartmentnumber,zipcode,city)
values ( 8,'aaa','12','00-928','Warszawa');
INSERT INTO address(id,street,apartmentnumber,zipcode,city)
values ( 9,'aaa','12','00-928','Warszawa');
INSERT INTO address(id,street,apartmentnumber,zipcode,city)
values ( 10,'aaa','12','00-928','Warszawa');
INSERT INTO address(id,street,apartmentnumber,zipcode,city)
values ( 11,'aaa','12','00-928','Warszawa');

//Lawyers

insert into lawyer(id,firstname,lastname,position,phonenumber,email)
VALUES (1, 'Michal', 'Kuchar','Junior','123456789','michalkuch@email.com' );
insert into lawyer(id,firstname,lastname,position,phonenumber,email)
VALUES ( 2,'Katarzyna', 'Kuchar','Junior','123456789','michalkuch@email.com' );
insert into lawyer(id,firstname,lastname,position,phonenumber,email)
VALUES ( 3,'Eryk', 'Kuchar','Junior','123456789','michalkuch@email.com' );
insert into lawyer(id, firstname,lastname,position,phonenumber,email)
VALUES ( 4,'Martyna', 'Kuchar','Junior','123456789','michalkuch@email.com' );
insert into lawyer(id,firstname,lastname,position,phonenumber,email)
VALUES ( 5,'Magdalena', 'Kuchar','Junior','123456789','michalkuch@email.com' );
insert into lawyer(id,firstname,lastname,position,phonenumber,email)
VALUES ( 6,'Jan', 'Kuchar','Junior','123456789','michalkuch@email.com' );
insert into lawyer(id,firstname,lastname,position,phonenumber,email)
VALUES (1, 'Michal', 'Kuchar','Junior','123456789','michalkuch@email.com' );

// Clients
insert into client(id,name,Address_id)
values(1,'Firma 1',1);
insert into client(id,name,Address_id)
values(1,'Firma 1',1);
insert into client(id,name,Address_id)
values(2,'Firma 2',2);
insert into client(id,name,Address_id)
values(3,'Firma 3',3);
insert into client(id,name,Address_id)
values(4,'Firma 4',4);
insert into client(id,name,Address_id)
values(5,'Firma 5',5);
insert into client(id,name,Address_id)
values(6,'Firma 6',6);
insert into client(id,name,Address_id)
values(7,'Firma 7',7);
insert into client(id,name,Address_id)
values(8,'Firma 8',8);
insert into client(id,name,Address_id)
values(9,'Firma 9',9);
insert into client(id,name,Address_id)
values(10,'Firma 10',10);


insert into LAWYER_CLIENTS(lawyers_id,Clients_id)
VALUES (1,1 );
insert into LAWYER_CLIENTS(lawyers_id,Clients_id)
VALUES (2,2 );
insert into LAWYER_CLIENTS(lawyers_id,Clients_id)
VALUES (1,2 );

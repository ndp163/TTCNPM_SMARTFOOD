use smartfood062020;

INSERT INTO category(code, name) VALUES('mon-phu', 'Món phụ');
INSERT INTO category(code, name) VALUES('mon-chinh', 'Món chính');
INSERT INTO category(code, name) VALUES('do-uong', 'Đồ uống');

SELECT * FROM foods;
SELECT * FROM category;
SELECT * FROM user;
SELECT * FROM role;
SELECT * FROM comment;

INSERT INTO foods(title, categoryid) VALUES('Món ăn 1', 1);
INSERT INTO foods(title, categoryid) VALUES('Món ăn 2', 1);
INSERT INTO foods(title, categoryid) VALUES('Món ăn 3', 2);
INSERT INTO foods(title, categoryid) VALUES('Món ăn 4', 3);

INSERT INTO role(imagecode, name) VALUES('ADMIN', 'Quản trị');
INSERT INTO role(code, name) VALUES('USER', 'Người dùng');

INSERT INTO user(username, password, fullname, status, roleid) VALUES('admin', '123456', 'admin1', 1, 1);
INSERT INTO user(username, password, fullname, status, roleid) VALUES('user1', '123456', 'user1', 1, 2);
INSERT INTO user(username, password, fullname, status, roleid) VALUES('user2', '123456', 'user2', 1, 2);
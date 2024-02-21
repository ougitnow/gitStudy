https://www.cnblogs.com/lyq159/p/12051059.html
https://blog.csdn.net/gao_jun1/article/details/111029254
由于mysqld –skip-grant-tables实测在mysql8.0中已失效，现使用mysqld --console --skip-grant-tables --shared-memory
update user set authentication_string="root" where user = "root";

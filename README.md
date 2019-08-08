# RBAC-
该文没有涉及到Shiro及SSO单点登录后续会有
RBAC登录
使用用户、角色、权限。对用户进行校验及访问权限的设置
该项目仅仅是一个简单的权限项目没有其他的配置
使用的SSM与JQuery+BootStrap树是使用的Ztree
使用4.0.0的spring，MyBatis是3.2.8
连接处使用的是C3P0

数据库为
t_permission    字段(id,name,url,pid,icon)
t_role   字段(id,name)
t_role_permission    字段（id,roleid,permissionid）
t_user      字段(id,username,loginacct,userpswd,email,createtime)
t_user_role     字段(id,roleid,userid)

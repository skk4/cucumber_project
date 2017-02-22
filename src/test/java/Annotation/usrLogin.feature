#language: zh-CN
@Userlogin
功能: 登录优芽

 @Login_one
   场景: 优芽站登录功能
       假设 打开google浏览器
	   当 打开yoya.com网站
	   那么 登录按键存在
	   那么 最后关闭浏览器
	   
 @Login_two	   
    场景: 优芽站登录功能
       假设 打开google浏览器
	   当 打开yoya.com网站
	   那么 登录按键存在
	   当 点击登录按键
	   那么 新的登录按键存在
	   假设 输入用户和密码
	   当 点击登录
	   那么 检查登录成功
	   那么 最后关闭浏览器
	   
   
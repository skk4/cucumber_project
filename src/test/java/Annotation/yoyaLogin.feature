@yoyaLogin
Feature: Test login the yoya
         Assert the login function

Scenario Outline: Successful Login the yoya
    Given 打开yoya登录页面 "http://www.yoya.com"
    Then 检查yoya页面是否打开
    Given 点击立刻登录按键
    Then  检查登录页面是否打开 
    When 输入用户名 "<username>" 密码 "<password>"
    Then 检查是否登录成功 "<exceptText>"

Examples:test login
	| username 	 | password 	| exceptText	|
	| xxegl 	 | 123456 	| 优芽网 帮您更优秀- www.yoya.com   	|
	| xiesj 	 | 123456 	| 优芽互动电影 	|


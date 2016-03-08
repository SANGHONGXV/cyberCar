﻿# cyberCar
we fight togther


# "cyberCar" 题目要求


## 赛题简介：介绍整个赛题的思路和整体要求
> 本赛题要求参赛选手开发一个车载移动移动应用软件。
> 要求设计新颖，功能独特，用户体验好，禁止抄袭。
> 因受于设备的限制，本赛题不要求购买任何车载设备以求达到本赛题目的。

## 赛题业务场景：描述赛题相关的真实企业业务背景。从真实场景中，适当简化或者提炼出适合比赛的赛题场景
>当今，人们对车的需求和使用越来越多，并伴随着人们的生活节奏的不断加快，人们对自身车的管理也越发强烈。而“互联网+”的提出进一步促进的车与互联网的整合，“车联网”也随之提出与发展，因此，用户对车载移动移动应用的需求也越来越大。根据业务场景和现实需求，本赛题需要开发以下主要功能：

1. 注册，登录，个人信息
2. 可预约加油
3. 地图实时显示当前汽车位置，并显示周围的加油站
4. 根据路况选择路线
5. 维护车辆信息
6. 开车时可听音乐
7. 交通违章信息

## 功能性需求
### 1. 注册，登录，个人信息
### 2. 预约加油：

#### 要求：

1. 绑定一个汽车信息 （个人可有多辆汽车）
2. 含有姓名，时间，加油站，加油类型，加油数量（升或金额）等信息。
3. 把数据发送给服务器并存储，生成二维码。此预约订单在APP显示二维码，以便去加油站扫码加油。
4. APP可查看提交后的预约订单详情

### 3. 地图实时显示当前汽车位置，并显示周围的加油站
####要求：

1. 以手机为载体作为汽车，实时更新当先位置
2. 并显示周围的加油站和显示加油站相关信息

### 4. 根据路况选择最优线路
####要求：

1. 起始点为：可输入地址或当前位置
2. 目的地：可输入地址
3. 起始和目的地可互换
4. 给予最优线路，并可实时告知当前位置

### 5. 维护车辆信息
#### 要求：

1. 可维护多辆个人汽车。
2. 假设汽车屏幕可提供此车辆当前信息的二维码,可供用户扫码，APP可扫码并把个人汽车信息维护到手机里面。（因此要求参赛者自己生成一个二维码，然后通过手机扫码完成此功能。）
3. 信息包含但不限于：汽车品牌、标志、型号、车牌号码、发动机号、车身级别（几门几座）、里程数、汽油量（%）、发动机性能（好、异常）、变速器性能（好、异常），车灯（好、坏）。
4. 汽车信息也需要维护到服务器端的数据库里。
5. 要求把以下通知及时推送到手机端
	* 当服务器端的数据库里记录的汽油量少于20%时，给手机发送通知告诉汽车车主该去加油
	* 服务器端的数据库里记录的里程数每超过15000公里倍数时，给手机发送通知告诉汽车车主需要进行维护
	* 当服务器端的数据库里记录的发动机出现异常、变速器出现异常或车灯有坏的时候，给手机发送通知告诉汽车车主需要进行维修

### 6. 可播放音乐
#### 要求：

1. 进入APP的时候，音乐自动播放
2. 出APP的时候，音乐结束
3. 音乐轮播
4. 请选项合适的音乐

### 7. 交通违章信息
#### 要求：

* 通过之前被绑定的车牌号和发动机号，调用（http://www.cheshouye.com/api.html（参考））提供的接口，获得违章信息并明显。

## 非功能性需求
1. 优秀的用户体验和功能设计。最终能达到简洁，大方，美观，用户体验良好的作品为佳。 
2. 基于Android 或IOS的原生开发或混合开发（Android 或 IOS二选一即可）。
3. 参赛者可根据自身能力和时间加入额外功能，如预约支付（支付宝，微信钱包，银联等）等。额外功能将占据一定的评比分数

## 其他限制条件：开发环境、实验平台、开发语言、数据库、编译器等限制条件（请尽量明确）
> 手机操作系统：Android 或IOS
> 服务器方面：不限。 

> 关于周围加油站信息的获取：可参考此网站https://www.juhe.cn/docs/api/id/7/aid/18 （有1000次的免费获取） 

> 关于汽车品牌、标志、型号可参考：

> [参考地址下载.txt] (http://www.cnsoftbei.com/upload_files/article/130/1_20160301160321_moz0q.txt)
 
> 因无车载设备把汽车数据传给服务器，因此功能需求5.E.a-c,可手动更改数据库的值进行功能测试。 

> 测试数据或平台：提供给参赛者的测试环境和测试数据。（可提供电子档）
	 IOS移动设备 
 Android移动设备 
 电脑

 >开发所需设备及设备指标需求说明
 	IOS移动设备 
Android移动设备 
电脑

## 其他要求
> 文档要求：概要设计说明书（描述软件系统架构、逻辑架构、物理架构、部署结构、功能架构及关键技术、关键业务模块需通过UML图进行详细描述）；程序安装包、源代码；列出使用的第三方包（包括原因，目的，实现的功能）；列出数据获取的来源）、需求规格说明书（包括功能设计、非功能性设计、系统用例）；可制作PPT、视频方式来生动展示； 
测试要求：需进行单元测试，提供单元测试用例；提供相关测试报告；

## 答疑老师联系方式：
> 姓名：钱屹东

> 邮箱：yidong.qian@pcitc.com
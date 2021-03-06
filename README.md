# Android-Develop-Beginner
## 安卓开发实训课程作业1
----
2020.07.06  
教师：字节跳动张导师

### 作业要求
----
* 创建一个Android app工程，包含一个activity（环境可以参考demo）
* 使用5种以上的View并实现一些简单交互  
    ImageView, Button, TextView, RadioButton, CheckBox, EditText, ProgressBar, SeekBar, Switch 等等不限
* 将一些交互结果输出log
* 注册一个github账号（已有就可以跳过此步）
* 创建一个仓库
* 把练习代码上传到github仓库里
* 发邮件给老师
* 标题“浙大android课程”
* 内容写上你的姓名，学号和git仓库地址  

### 本人实现
----
* ImageView  
    - 无交互，背景图
* Button x 2  
    - 分别为缩小字体和改变TextView的内容
* TextView x 2
* CheckBox  
    - 功能和Button很像，打勾时有文本显现，取消则文本隐藏
* EditText  
    - 类似输入框
* Switch  
    - 本来想设计启动深色模式，但是要改变背景色太难了，于是只能改变文本框的背景色

## 安卓开发实训课程作业2
----
2020.07.07  
教师：字节跳动王老师

### 作业要求
----
* Logcat在屏幕旋转的时候#onStop() #onDestroy()会展示出来，但UI界面我们看不到，在今天课程基础上想办法补全它，让其跟Logcat的展示一样
* ⼀个抖⾳笔试题：统计⻚⾯所有view的个数 ViewGroup中的API：getChildCount() getChildAt()
* 实现⼀个抖⾳消息⻚⾯，且点击每个recycleview的item,能够跳转到⼀个新的界⾯，并且在新的⻚⾯显示出他是第⼏个item

### 本人实现
----
* 统计⻚⾯所有view的个数
* 实现⼀个抖⾳消息⻚⾯

## 安卓开发实训课程作业3
----
2020.07.08  
教师：字节跳动朱老师

### 作业要求
----
* 引入并使用Lottie库实现简单的图标动画
* 使用属性动画，练习AnimatorSet和scale/fade等基本动画样式
* （选做）用TabLayout，ViewPager实现一个简单的好友列表界面

### 本人实现
----
* 引入并使用Lottie库实现简单的图标动画
* 使用属性动画，练习AnimatorSet和scale/fade等基本动画样式
* 用TabLayout，ViewPager做一个简单的好友列表界面
    - 使用 ViewPager 和 Fragment 做个可滑动界面
    - 使用 TabLayout 添加 Tab 支持（但是点不动第二个Tab，不知道为什么）
    - 对于好友列表 Fragment，使用 Lottie 实现 Loading 效果，在 5s 后展示实际的列表，要求这里的动效是淡入淡出

## 安卓开发实训课程作业4
----
2020.07.09  
教师：字节跳动王老师

### 作业要求
----
* 时钟App
    - 绘制时钟界面，包括时针、分针、秒针
    - 时针、分针、秒针需要跳动
    - 时针、分针、秒针的粗细、长短不同
    - 绘制表盘上的数字（可选）
    - 用点绘制表盘刻度（可选）
    
### 本人实现
----
* 时钟App
    - 绘制时钟界面，包括时针、分针、秒针
    - 时针、分针、秒针需要跳动
    - 时针、分针、秒针的粗细、长短不同
    - 绘制表盘上的数字
    - 用点绘制表盘刻度
    
## 安卓开发实训课程作业5
----
2020.07.10  
教师：字节跳动彭老师

### 作业要求
----
* 基于Demo，完成一个上传图片和视频的APK
    
### 本人实现
----
* 基于Demo，完成一个上传图片和视频的APK

## 安卓开发实训课程作业6
----
2020.07.13  
教师：字节跳动王老师

### 作业要求
----
* 一个简单的To-do List App
    - 为To-do List的场景建立一个数据库，完成数据库表的设计和创建
    - 进入主页后，从数据库中查询出所有的数据，并以列表形式呈现出来
    - 点击加号后跳转到一个新页面，输入任意内容，点击CONFIRM后把内容插入数据库中，返回主页并更新主页数据
    - 点击每个note前边的checkbox能把该条note置为“已完成”，并更新数据库和UI
    - 点击每个note后边的 x 能把该条note删除，并更新数据库和UI
    
### 本人实现
----
* 一个简单的To-do List App
    - 修改老师建好的数据库表，增加字段和点击事件
    - 点击加号后跳转到一个新页面，输入任意内容，**可以多行输入**，点击CONFIRM后把内容插入数据库中，返回主页并更新主页数据
    - 点击每个note前边的checkbox能把该条note置为“已完成”，**变灰，并增加删除线**，并更新数据库和UI
    - 点击每个note后边的 x 能把该条note删除，并更新数据库和UI
    
## 安卓开发实训课程作业7
----
2020.07.14  
教师：字节跳动周老师

### 作业要求
----
* 开发一个可以展示图片可以播放视频的APP
1. 使用Glide展示网络图片
    - 加载中、加载失败有占位图
    - 实现图片圆角功能（可选）
    - 渐变展示（可选）
2. 播放网络视频
    - 播放、暂停功能
    - 播放进度条展示（包括时间显示）
    - 进度条可以点击、滑动、跳转到指定位置（可选）
    - 横竖屏切换、横屏时展示全屏模式（可选）
    - 将app注册为播放器类型（Action为ACTION_VIEW, Data为Uri，Type为其MIME类型），点击打开系统视频文件时，可以选择使用自制播放器（可选）
    
### 本人实现
----
* 开发一个可以展示图片可以播放视频的APP
1. 使用Glide展示网络图片
    - 加载中、加载失败有占位图
    - 实现图片圆角功能
    - 渐变展示
2. 播放网络视频
    - 播放、暂停功能
    - 播放进度条展示（包括时间显示）
    - 进度条可以点击、滑动、跳转到指定位置
    - 横竖屏切换、横屏时展示全屏模式（**但是横屏时效果很不好**）
    
## 安卓开发实训课程作业8
----
2020.07.15  
教师：字节跳动付老师

### 作业要求
----
* 开发一个可以自定义录制的APP
    - 使用系统相机拍照
    - 录制一段视频
    - 探索实时变焦
    - 探索开启闪光灯
    - 探索延时拍摄
    - 探索录制暂停和恢复，分段录制
    
### 本人实现
----
* 开发一个可以自定义录制的APP
    - 使用系统相机拍照
    - 录制一段视频
    - 变焦
    - 自拍

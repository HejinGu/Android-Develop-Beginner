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
* （选做）TabLayout，ViewPager

### 本人实现
----
* 引入并使用Lottie库实现简单的图标动画
* 使用属性动画，练习AnimatorSet和scale/fade等基本动画样式

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
* 实际上老师给的Clock.java已经很全面了，只要在#onDraw函数里加一个handler的postInvalidate()，再加一个画中间圆的函数即可

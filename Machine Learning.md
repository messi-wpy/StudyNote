### [课程](https://www.coursera.org/learn/machine-learning/)－－－吴恩达老师


### [学习路线](https://blog.csdn.net/baihuaxiu123/article/details/52464510)

本来准备边看视频边看周志华大佬的西瓜书，结果第三章看完就给跪了，全是数学公式，总之，在没有把数学基础打好之前还是先别看这本书了（
数学学习参考上面的学习路线，主要是微积分，概统，线性代数矩阵）否则完全看不懂的．．．相反视频里的是相对简单的，还有专门介绍线性代数的课程
可以先看这个入门，然后再继续西瓜书


第一周课程内容
### 基础名词

1. 回归与分类
2. 监督与不监督学习
3. 　我们的目标是，在给定训练集的情况下，学习函数h：X→Y，使得h（x）是y的对应值的“好”预测器
4. 假设函数

---

### 方法
##### 线性回归
1.cost function使用代价函数来衡量假设函数的准确性
房价预测（线性回归问题）：choose i0,i1 so that h(x)is close to y for our training examples(x,y)
mini

目标：假设函数的斜率和截距　更符合样本
代价函数：－－－计算样本与计算的差距

 J(i0,i1)=  1/2m∑(h(xi)-yi)^2－－平法差代价函数
![cost function](/pictures/costfunction.png)




2.梯度下降－－计算　cost function－－min j(i0,i1);
不断递归计算，到函数收敛
![梯度下降计算](/pictures/GradientDescent.png)

#### 多特征的线性回归

1. 代价函数，参数梯度下降的变化，（偏导数）
2. 特征缩放

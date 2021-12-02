declare i32 @getint()
declare void @putint(i32)
declare void @putch(i32)
declare i32 @getch()
declare void @memset(i32*, i32, i32)
declare i32 @getarray(i32*)
declare void @putarray(i32, i32*)
define dso_local void @set1  (  i32 %t1 ,  i32* %l2 ){
   %l1 = alloca i32
   store i32 %t1 , i32* %l1
   %t2 = load i32 , i32* %l1
   %t4 = mul nsw i32 1 , %t2
   %t5 = add i32 %t4 , 0
   %t3 = getelementptr i32, i32* %l2 , i32 %t5
   store i32 1, i32* %t3
   ret void
}
define dso_local i32 @main ( ){
   %l3 = alloca [ 10 x i32 ], i32 10
   %l4 = alloca i32
   %l5 = alloca i32
   %t7 = add i32 0 , 0
   %t6 = getelementptr [ 10 x i32 ], [ 10 x i32 ]* %l3 , i32 0, i32 %t7
   %t8 = call i32 @getarray( i32* %t6 )
   store i32 %t8, i32* %l4
   %t10 = add i32 5 , 0
   %t9 = getelementptr [ 10 x i32 ], [ 10 x i32 ]* %l3 , i32 0, i32 %t10
   %t11 = call i32 @getarray( i32* %t9 )
   store i32 0,i32* %l5
   br label %b1
   b1:
   %t12 = load i32 , i32* %l5
   %t13 = load i32 , i32* %l4
   %t14 = icmp slt i32 %t12 , %t13
   br i1 %t14, label %b2, label %b3
   b2:
   %t15 = load i32 , i32* %l5
   %t16 = load i32 , i32* %l5
   %t17 = srem i32 %t16 , 2
   %t19 = mul nsw i32 5 , %t17
   %t20 = add i32 %t19 , 0
   %t18 = getelementptr [ 10 x i32 ], [ 10 x i32 ]* %l3 , i32 0, i32 %t20
   call void @set1( i32 %t15, i32* %t18 )
   %t21 = load i32 , i32* %l5
   %t22 = add i32 %t21 , 1
   store i32 %t22, i32* %l5
   br label %b1
   b3:
   %t23 = load i32 , i32* %l4
   %t25 = add i32 0 , 0
   %t24 = getelementptr [ 10 x i32 ], [ 10 x i32 ]* %l3 , i32 0, i32 %t25
   call void @putarray( i32 %t23, i32* %t24 )
   %t26 = load i32 , i32* %l4
   %t28 = add i32 5 , 0
   %t27 = getelementptr [ 10 x i32 ], [ 10 x i32 ]* %l3 , i32 0, i32 %t28
   call void @putarray( i32 %t26, i32* %t27 )
   ret i32 0
}

